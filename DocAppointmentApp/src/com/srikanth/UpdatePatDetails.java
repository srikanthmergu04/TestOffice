package com.srikanth;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdatePatDetails
 */
@WebServlet("/UpdatePatDetails")
public class UpdatePatDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePatDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String st = request.getParameter("key");
		System.out.println(st);
		if(st.equals("Delete"))
		{
			String str = request.getParameter("select");
			
			DeletePatientTable up = new DeletePatientTable(str);
			try {
				up.DeleteFromDb();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
	        rd.forward(request,response);
			
		}
		else
		{
			String str = request.getParameter("select");
			//	System.out.println(str);
				ArrayList ls = new ArrayList();
				getPatDetailsFromDb pat = new getPatDetailsFromDb(str);
				try {
					ls = pat.getDetails();
					//System.out.println(ls.get(5));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 HttpSession session = request.getSession();
				 
					session.setAttribute("PatList", ls);
					
					response.sendRedirect("UdtPatDetails.jsp");
				//doGet(request, response);
			
		}

	}

}
