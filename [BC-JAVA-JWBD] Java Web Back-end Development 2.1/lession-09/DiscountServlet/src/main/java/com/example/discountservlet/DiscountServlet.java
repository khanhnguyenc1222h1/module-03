package com.example.discountservlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        float Price = Float.parseFloat(request.getParameter("price"));
        float Percent = Float.parseFloat(request.getParameter("percent"));
        float Amount = (float)(Price * Percent * 0.01) ;
        // Hello
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("Discount Amount: " + Amount);
        System.out.println("===========");
        writer.println("<br/>");
        writer.println("Discount Price: " + Price);
        writer.println("</body></html>");
    }

    public void destroy() {
    }
}