package com.example.simpledictionaryjsp;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "SimpleDictionary", value = "/dictionary")
public class SimpleDictionary extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String search = request.getParameter("search");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("dictionary.jsp");
        requestDispatcher.forward(request, response);

    }

    public void destroy() {
    }
}