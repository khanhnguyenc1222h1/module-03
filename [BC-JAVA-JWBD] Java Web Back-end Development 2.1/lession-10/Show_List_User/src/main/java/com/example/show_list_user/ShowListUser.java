package com.example.show_list_user;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ShowListUser", value = "/index")
public class ShowListUser extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String address = request.getParameter("address");
        // Hello
        PrintWriter out = response.getWriter();
/*        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }*/

    public void destroy() {
    }
}