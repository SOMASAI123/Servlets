package com.session;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class Servlet2  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		
		Cookie[] cookie=req.getCookies();
		boolean flag=false;
		if(cookie != null)
		{   
			for(Cookie c:cookie) {
			String name= c.getName();
				if(name.equals("username")) {
					System.out.println("username is "+c.getValue());
					writer.append("""
					        <h1> welcome: %s 
					        """.formatted(c.getValue()));


					flag =true;
				}
				else if(name.equals("id")) {
					System.out.println("username is "+c.getValue());
					writer.append("""
					        <h1> user id: %s
					        """.formatted(c.getValue()));

					flag =true;
				}
			}
		}
		
		
		
		HttpSession session= req.getSession();
		String Sec=(String) session.getAttribute("userkey");
		
		System.out.println(Sec);
		writer.append(""" 
				
			<h1>user key is: %s
			""".formatted(Sec));
		
		
		
		if(flag)
		{
			writer.println("<h1>username is present</h1>");
		}
		else
		{
			writer.println("<h1>username is not  present</h1>");
		}
		
		
		
	}
   
	
	
}
