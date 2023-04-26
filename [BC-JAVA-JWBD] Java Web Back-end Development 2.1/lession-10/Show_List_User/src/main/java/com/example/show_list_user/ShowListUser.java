package com.example.show_list_user;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ShowListUser", value = "/index")
public class ShowListUser extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String address = request.getParameter("address");
        PrintWriter out = response.getWriter();
    }
}