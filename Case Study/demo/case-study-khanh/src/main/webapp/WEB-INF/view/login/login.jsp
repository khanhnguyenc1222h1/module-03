<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/04/2023
  Time: 9:25 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div align="center">
    <form method="post">
        <fieldset style="width: 300px">
            <legend style="text-align: center"><span style="font-size: 30px"><b>Login</b></span></legend><br>
            <div style="text-align: left; font-size: 20px" >
                <label>Username: </label>
                <input type="text" placeholder="username" name="username"><br><br>
                <label>Password: </label>
                <input type="password" placeholder="password" name="password"><br><br>
                <input type="radio" ><label>đồng ý chấp nhận các điều khoản</label><br><br>
                <div style="text-align: center"><input type="submit" value="Submit" style="font-size: 20px; width: 200px"></div>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
