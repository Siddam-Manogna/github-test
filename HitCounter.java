package com.counter.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounter
 */
@WebServlet("/HitCounter")
public class HitCounter extends HttpServlet {
	

	private int Count; 

	   public void init() { 
	      // Reset hit counter.
	      Count = 0;
	   } 
	   @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

	      // This method executes whenever the servlet is hit 
	      // increment hitCount 
	      Count++; 
	      PrintWriter out = response.getWriter();
	      String title = "Total Number of Views:";
	     out.println(title);
	      out.println(Count);
	    
	   }

}
