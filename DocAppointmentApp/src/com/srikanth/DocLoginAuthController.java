package com.srikanth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DocLoginAuthController
 */
@WebServlet("/DocLoginAuthController")
public class DocLoginAuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DocLoginAuthController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String pid = request.getParameter("pid");
		//System.out.println(uname);
		
		DocLoginAuthenticate Doc = new DocLoginAuthenticate(uname,pid);
		
		
		try {
		
			boolean temp = Doc.AuthenticateUser();
			if(temp == true)
			{
				RequestDispatcher rd = request.getRequestDispatcher("patientlogin.jsp");
	            rd.forward(request,response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
    			rd.forward(request, response);
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
