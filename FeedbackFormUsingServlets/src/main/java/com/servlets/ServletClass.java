package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/third")  // You can uncomment this to use annotation-based configuration
public class ServletClass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String phno = req.getParameter("phno");
        String feedback = req.getParameter("feedback");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.print("<h1>Form submitted</h1>");

        writer.print(String.format(
                "<h1> User name is: %s</h1><h1> Phone number is: %s</h1><h1> Feedback area: %s</h1>",
                username, phno, feedback));
    }
}
