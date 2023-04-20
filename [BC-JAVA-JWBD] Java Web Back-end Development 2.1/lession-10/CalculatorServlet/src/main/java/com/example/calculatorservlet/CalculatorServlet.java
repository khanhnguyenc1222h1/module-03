package com.example.calculatorservlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import static com.example.calculatorservlet.Calculator.calculator;

@WebServlet(name = "CalculatorServlet", value = "/calculator" )
public class CalculatorServlet extends HttpServlet {

    public void init() {
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        float number_first = Float.parseFloat(request.getParameter("number_first"));
        float number_two = Float.parseFloat(request.getParameter("number_two"));
        char operator = request.getParameter("operator").charAt(0);
        try{
            float result = calculator(number_first,number_two,operator);
            out.println("<html><body>");
            out.println("<h2>Result:</h2>");
            out.println(number_first+ " " +operator+ " " + number_two+ " = " + result);
        }catch (Exception e){
            e.printStackTrace();
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}