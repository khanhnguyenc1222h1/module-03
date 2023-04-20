package com.example.simple_login;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hello
        PrintWriter write = response.getWriter();
        write.println("<html><body>");
        if("admin".equals(username) && "admin".equals(password)){
            write.println("<h1>Welcome " + username + " to website</h1>");
        }else{
            write.println("<h1>Login Error</h1>");
        }
        write.println("</body></html>");
    }

    public void destroy() {
    }
}