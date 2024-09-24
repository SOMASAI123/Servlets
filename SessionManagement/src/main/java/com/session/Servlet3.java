package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  resp.setContentType("text/html");
		    PrintWriter writer=resp.getWriter();
			
			String username=req.getParameter("name");
			String phno=req.getParameter("phno");
			String feedback=req.getParameter("feedback");
			
		writer.println(""" 
				
	<h1>username is %s</h1> 
	<h1>user id is %s </h1> 
	<h1>feedback area is %s</h1>

	""".formatted(username,phno,feedback));
		
	}

	
	
	
} 
