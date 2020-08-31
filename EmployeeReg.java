package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeReg extends HttpServlet { 
	     @Override
		public void doPost(HttpServletRequest request, HttpServletResponse response)  
		            throws ServletException, IOException {  
		  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String un=request.getParameter("userName");
	    String ei=request.getParameter("EmpId");
		String ea=request.getParameter("EmpAdd");
		String ue=request.getParameter("userEmail");
		String up=request.getParameter("userPass");
		String cp=request.getParameter("confPass");
		String g=request.getParameter("gender");  
		 
		    
		String d=request.getParameter("dob");  
		String sq=request.getParameter("SeqQue");
		String sa=request.getParameter("SeqAns");
		
		 out.print(un);
		 out.print(ei);
		 out.print(ea);
		 out.print(ue);
		 out.print(up);
		 out.print(cp);
		 out.print(g);
		 out.print(d);
		 out.print(sq);
		 out.print(sa);
		 String arr[]= request.getParameterValues("langKnown");
		   
		    for(String a:arr)
		    {
		   
		    out.println(a+"<br>");
		    }
		
			}
}
		          
		

