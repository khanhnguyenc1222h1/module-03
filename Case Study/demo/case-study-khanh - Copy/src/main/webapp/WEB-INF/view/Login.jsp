<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div align="center">
    <form method="post" action="/login">
        <fieldset style="width: 300px">
            <legend style="text-align: center"><span style="font-size: 30px"><b>Login</b></span></legend><br>
            <div style="text-align: left; font-size: 20px" >
                <label>username: </label>
                <input type="text" placeholder="username" name="username"><br><br>
                <label>password: </label>
                <input type="password" placeholder="password" name="password"><br><br>
                <div style="text-align: center"><input type="submit" value="Login" style="font-size: 20px; width: 200px"></div>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>