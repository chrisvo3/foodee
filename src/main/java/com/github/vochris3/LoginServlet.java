package com.github.vochris3;

/**
 * -class-
 * creator: Chris Vo
 * date: 29 Dec 2020
 * project: practice-site
 * package: com.github.vochris3
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello World!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // print Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>First Servlet WebApp</title>");
        out.println("</head><body>");
        out.println("<h1>Chris First Servlet WebApp</h1>");
        out.println("</body></html>");
    }

    public void destroy() {

    }

}
