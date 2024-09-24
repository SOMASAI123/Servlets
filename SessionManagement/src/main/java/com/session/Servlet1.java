package com.session;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   
		//String username=req.getParameter("name");
		//String phno=req.getParameter("phno");
		
		String username="somasai";
	    String id="1234";
		
		Cookie cookie=new Cookie("username",username);
		Cookie cookie1= new Cookie("id",id);
		
		cookie.setMaxAge(10*60);
		cookie1.setMaxAge(10*60);
		
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>cookies created successfully</h1>");
		
		
		HttpSession session= req.getSession();
		
		session.setAttribute("userkey","12345");
		session.setMaxInactiveInterval(10*60);
		

		resp.setContentType("text/html");
		resp.getWriter().println("<h1>cookies created successfully</h1>");
		
	}
	
	

}
