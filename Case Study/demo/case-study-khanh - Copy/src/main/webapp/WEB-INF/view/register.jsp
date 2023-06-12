<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/04/2023
  Time: 9:26 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<div align="center">
  <form  method="post" action="/register">
    <fieldset style="width: 400px">
      <legend style="text-align: center"><span style="font-size: 30px"><b>Register</b></span></legend><br>
      <div style="text-align: left; font-size: 20px" >
        <label>Full Name: </label>
        <input type="text" placeholder="fullname" name="fullname"><br><br>
        <label>Address:</label><br>
        <input type="text" placeholder="address" name="address" style="width: 400px"><br><br>
        <label>Phone Number: </label>
        <input type="number" placeholder="phone number" name="phonenumber"><br><br>
        <label>Username: </label>
        <input type="text" placeholder="username" name="username"><br><br>
        <label>Password: </label>
        <input type="password" placeholder="password" name="password"><br><br>
        <div style="text-align: center"><input type="submit" value="Submit" style="font-size: 20px; width: 300px"></div>
      </div>
    </fieldset>
  </form>
</div>
</body>
</html>
