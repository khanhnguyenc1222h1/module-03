<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/04/2023
  Time: 11:34 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Post</title>
</head>
<body>
<div align="center">
    <form method="post" action="/update">
        <fieldset style="width: 300px ; margin-top: 100px;">
            <legend style="text-align: center"><span style="font-size: 30px"><b>Update Post</b></span></legend><br>
            <div style="text-align: left; font-size: 20px" >
                <label>Url image: </label>
                <input type="url"  value="${pt.urlImage}" name="image"><br><br>
                <label>Post: </label>
                <input type="text" value="${pt.textPost}" name="txt"><br><br>
                <label>Id post: </label>
                <input type="number" style="width: 70px;" value="${pt.id}" readonly name="id"><br><br>
                <div style="text-align: center"><input type="submit" value="Update" style="font-size: 20px; width: 200px"></div>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
