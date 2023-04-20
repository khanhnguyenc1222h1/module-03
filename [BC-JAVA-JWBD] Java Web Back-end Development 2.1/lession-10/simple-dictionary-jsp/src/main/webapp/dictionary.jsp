<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/04/2023
  Time: 8:54 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%
  Map<String,String> dic = new HashMap<>();
%>
<%
  dic.put("hello","xin chào");
  dic.put("how","thế nào");
  dic.put("book","quyển vở");
  dic.put("computer","máy tính");
%>
<%
  String search = request.getParameter("search");
  String result = dic.get(search);
  PrintWriter outs = response.getWriter();
  if(result != null){
    outs.println("Word: "+search);
    outs.println("<br/>");
    outs.println("Result: "+result);
  }else{
    outs.println("Not Found");
  }
%>
</body>
</html>
