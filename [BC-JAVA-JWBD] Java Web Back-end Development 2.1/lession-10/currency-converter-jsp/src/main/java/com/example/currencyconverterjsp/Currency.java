package com.example.currencyconverterjsp;

import java.io.*;
import java.text.NumberFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Currency", value = "/converter")
public class Currency extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd ;

        if(usd != 0 ){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(request, response);
        }else{
            response.sendRedirect("index.jsp");
        }


        // Hello
//        PrintWriter writer = response.getWriter();
//        writer.println("<html><body>");
//        writer.println("<h1>" + message + "</h1>");
//        writer.println("</body></html>");
    }

    public void destroy() {
    }
}