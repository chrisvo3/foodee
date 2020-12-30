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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>First Servlet WebApp</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Chris First Servlet WebApp</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
