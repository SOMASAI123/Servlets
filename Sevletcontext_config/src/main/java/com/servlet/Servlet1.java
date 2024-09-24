package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
   

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
		
		ServletConfig servletConfig=getServletConfig();
		ServletContext servletContext=servletConfig.getServletContext();
		
		String contextparam=servletContext.getInitParameter("id");
		String configparam=servletConfig.getInitParameter("name");
		String configparam2=servletConfig.getInitParameter("email");
		
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println(""" 
			 <h1> id is: %s
				 <h1> name is: %s  
				 <h1> email is: %s 
				 """.formatted(contextparam,configparam,configparam2));
		
	}
}
