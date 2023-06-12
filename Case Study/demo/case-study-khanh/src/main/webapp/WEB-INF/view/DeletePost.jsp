<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/04/2023
  Time: 10:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Delete Post</title>
</head>
<body>
<div align="center">
  <form method="post" action="/show">
    <fieldset style="width: 200px; margin-top: 100px;" >
      <legend style="text-align: center"><span style="font-size: 30px"><b>Delete Post</b></span></legend><br>
      <div style="text-align: left; font-size: 20px" >
        <label>Delete id: </label>
        <input type="number" style="width: 70px;" placeholder="0" name="id_post"><br><br>
        <div style="text-align: center"><input type="submit" value="Delete" style="font-size: 20px; width: 140px"></div>
      </div>
    </fieldset>
  </form>
</div>
</body>
</html>
