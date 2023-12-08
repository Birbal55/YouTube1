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
 * Servlet implementation class S2
 */
@WebServlet("/S2")
public class S2 extends HttpServlet {
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = res.getWriter()){
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Servlet S1</title>");
				out.println("<head>");
				out.println("<body>");
				
				int nn1 = Integer.parseInt(req.getParameter("n1"));
				int nn2 = Integer.parseInt(req.getParameter("n2"));
				
				//mul
				int p = nn1 * nn2;
				
				//get attribute from request object
				
				int sum = (int)req.getAttribute("sum");
				out.println("<h1>");
				out.println("Sum is = " + sum);
				out.println("Product is = " + p);
				out.println("</h1>");
				
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
