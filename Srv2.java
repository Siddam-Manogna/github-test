package com.mydrv.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Srv2
 */
@WebServlet(name = "EmpSrv2", urlPatterns = { "/EmpSrv2" })
public class Srv2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out=response.getWriter();
	response.setContentType("text/html");

	HttpSession session= request.getSession();

	Employee employee=(Employee)session.getAttribute("employee");

	out.print(employee);

	out.print("<form action='EmpSrv3'>");
	out.print(" <input type='submit'>");
	out.print(" </form>");


	}

	}

