package com.example.servertime;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServerTimeServlet", value = "/index")
public class ServerTimeServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        Date today = new Date();
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + today + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}