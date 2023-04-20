package com.example.javawebcurrencyconverter;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConverterServlet extends HttpServlet {


    public void init() {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        float   rate = Float.parseFloat(request.getParameter("rate"));
        float   usd = Float.parseFloat(request.getParameter("usd"));
        float   vnd = rate * usd;
        // Hello
        PrintWriter write = response.getWriter();
        write.println("<html><body>");
        write.println("<h1> Rate: " + rate +"</h1>");
        write.println("<h1> USD: " + usd +"</h1>");
        write.println("<h1> VND: " + vnd +"</h1>");
        write.println("</body></html>");
    }

    public void destroy() {
    }
}