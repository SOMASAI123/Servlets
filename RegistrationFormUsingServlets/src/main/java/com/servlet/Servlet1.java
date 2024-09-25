package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    resp.setContentType("text/html");
	    PrintWriter writer = resp.getWriter();

	    String name = req.getParameter("name");
	    String password = req.getParameter("password");
	    String email = req.getParameter("email");

	    try {
	        // Load the MySQL driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        // Establish the database connection
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "SAISRAVAN@1234");

	        // SQL query with placeholders
	        String q = "INSERT INTO register ( name, password, email) VALUES ( ?, ?, ?)";

	        // Create a PreparedStatement
	        PreparedStatement pst = con.prepareStatement(q);

	      
	        pst.setString(1, name); // Placeholder for name
	        pst.setString(2, password); // Placeholder for password
	        pst.setString(3, email); // Placeholder for email

	        // Execute the query
	        int result = pst.executeUpdate();

	        if(result > 0) {
	            writer.println("Record successfully inserted.");
	            
	            RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
	            rd.forward(req, resp);
	            
	        } else {
	            writer.println("Failed to insert the record.");
	        }

	        // Close the resources
	        pst.close();
	        con.close();

	    } catch (Exception e) {
	        System.out.println(e);
	        writer.println("Error: " + e.getMessage());
	    }
	}

	
}
