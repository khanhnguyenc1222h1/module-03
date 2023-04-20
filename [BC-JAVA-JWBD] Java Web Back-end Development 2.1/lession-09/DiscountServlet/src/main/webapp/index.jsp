<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/display-discount" method="post">
    <label>Product Description</label><br/>
    <label>List Price</label>
    <input type="text" name="price" placeholder="0"><br/>
    <label>Discount Percent</label>
    <input type="text" name="percent" placeholder="%"><br/><br/>
    <input type="submit" name="submit" value="Calculate Discount">
</form>
</body>
</html>