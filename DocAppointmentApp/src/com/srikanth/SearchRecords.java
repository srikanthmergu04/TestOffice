package com.srikanth;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchRecords
 */
@WebServlet("/SearchRecords")
public class SearchRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchRecords() {
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
		
		String str = request.getParameter("id");
		System.out.println(str);
			ArrayList ls = new ArrayList();
			ArrayList list = new ArrayList();
			
			list.add("ID");
			list.add("NAME");
			list.add("AGE");
			list.add("GENDER");
			list.add("MOBILE-NO");
			list.add("MAIL-ID");
			list.add("USERNAME");
			list.add("PASSWORD");
			
			getPatDetailsFromDb pat = new getPatDetailsFromDb(str);
			try {
				ls = pat.getDetails();
				//System.out.println(ls.get(5));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 HttpSession session = request.getSession();
			 
				session.setAttribute("PatRecord", ls);
				session.setAttribute("Patid", list);
				
				response.sendRedirect("ShowRecord.jsp");
		//doGet(request, response);
	}

}
