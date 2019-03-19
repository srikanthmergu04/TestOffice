package com.srikanth;

import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PatDisplayController
 */
@WebServlet("/PatDisplayController")
public class PatDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatDisplayController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PatDetails pd1 = new PatDetails();
		
		ArrayList list = new ArrayList();
		
		
		try {
			list  = pd1.getPatDetails();
			
			Iterator  it = list.iterator();
			System.out.println("Patient Details are");
			/*
			while(it.hasNext()){
				
				System.out.println(it.next());
			}
			*/
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 HttpSession session = request.getSession();
		 
		session.setAttribute("PatList", list);
		//int size;
		session.setAttribute("size", list.size());
		
		response.sendRedirect("DisplayPatDetails.jsp");
		//response.getWriter().append("Servedgoto at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		PatDetails pd1 = new PatDetails();
		
		ArrayList list = new ArrayList();
		
		
		try {
			list  = pd1.getPatDetails();
			
			Iterator  it = list.iterator();
			//System.out.println("Patient Details are");
			/*
			while(it.hasNext()){
				
				System.out.println(it.next());
			}
			*/
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 HttpSession session = request.getSession();
		 
		session.setAttribute("PatList", list);
		//int size;
		session.setAttribute("size", list.size());
		
		response.sendRedirect("DisplayPatDetails.jsp");
		
		
		
		
		
	}

}
