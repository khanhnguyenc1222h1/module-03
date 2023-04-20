<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.util.Locale" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/04/2023
  Time: 4:15 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
  float rate = Float.parseFloat(request.getParameter("rate"));
  float usd = Float.parseFloat(request.getParameter("usd"));

  float vnd = rate * usd;
    Locale locale = new Locale("us", "VN");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
%>
<h1>Rate: <%=currencyFormatter.format(rate)%></h1>
<h1>USD: <%= usd%></h1>
<h1>VND: <%= currencyFormatter.format(vnd)%></h1>
</body>
</html>
