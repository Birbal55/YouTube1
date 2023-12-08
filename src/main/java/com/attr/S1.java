package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = res.getWriter()){
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Servlet S1</title>");
				out.println("<head>");
				out.println("<body>");
				
				String n1 = req.getParameter("n1");
				String n2 = req.getParameter("n2");
				
				int nn1 = Integer.parseInt(n1);
				int nn2 = Integer.parseInt(n2);
				
				//add
				int s = nn1 + nn2;
				
				//attribute...................
				
				req.setAttribute("sum",s);
				
				//request.......request dispatcher
				
				RequestDispatcher rd = req.getRequestDispatcher("s2");
				
				rd.forward(req, res);
				
				out.println("<body>");
				out.println("<html>");
		}
	}
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		processRequest(req,res);
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		processRequest(req,res);
	}
	
	public String getServletInfo() {
		return "Short description";
	}

}
