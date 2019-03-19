package com.srikanth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatePatientDetailsController
 */
@WebServlet("/UpdatePatientDetailsController")
public class UpdatePatientDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePatientDetailsController() {
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
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String mobileno = request.getParameter("mobileno");
		String mailid = request.getParameter("mailid");
		String uname = request.getParameter("uname");
		String pid = request.getParameter("pid");
		String key = request.getParameter("key");
		
		UpdatePatientDbTable up = new UpdatePatientDbTable(name,id,age,gender,mobileno,mailid,uname,pid,key);
		try {
			up.UpdateToDb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
        rd.forward(request,response);
		
		//doGet(request, response);
	}

}
