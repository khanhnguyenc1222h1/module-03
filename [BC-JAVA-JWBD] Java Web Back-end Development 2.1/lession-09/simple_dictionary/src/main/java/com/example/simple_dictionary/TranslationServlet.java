package com.example.simple_dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TranslationServlet", value = "/translate")
public class TranslationServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("how", "thế nào");
        dictionary.put("book", "quyển vở");
        dictionary.put("computer", "máy tính");
        String search = request.getParameter("txtSearch");
        String result = dictionary.get(search);
        PrintWriter write = response.getWriter();
        write.println("<html><head>");
        write.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        write.println("</head>");
        write.println("<body>");
        if(result != null){
            write.println("Word: " + search);
            write.println("<br/>");
            write.println("Result: "+ result);
        }else{
         write.println("not found");
        }
        write.println("</body></html>");
    }

    public void destroy() {
    }
}