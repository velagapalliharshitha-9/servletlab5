package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class logout extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Logout</title></head>");
        out.println("<body>");
        out.println("<h1>Logout Successful!</h1>");
        out.println("<p>You have been logged out.</p>");
        out.println("<a href='/login'>Login Again</a>");
        out.println("</body>");
        out.println("</html>");
    }
}