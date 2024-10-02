package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		
		String  name=req.getParameter("name");
		String password=req.getParameter("password");
		
		  req.setAttribute("name", name);
	      req.setAttribute("Password", password);

		
		try {
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "SAISRAVAN@1234");
			
			String query="select *from register where name = ? and password= ?";
			
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2,password);
			ResultSet rs=pst.executeQuery();
			
			if(rs.next())
			{   
				writer.println("<h1> sucessfully registered ");
				RequestDispatcher rd=req.getRequestDispatcher("sucess.jsp");
				rd.forward(req, resp);
			}
			
			else
			{    
				writer.println("<h1> incorrect username or password");
				 RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
				 rd.include(req, resp);
			}
			
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
	}
    
	
}
