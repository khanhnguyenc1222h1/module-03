<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Create Post</title>
</head>
<body>
<div align="center">
  <form method="post" action="/add">
    <fieldset style="width: 300px;margin-top: 100px">
      <legend style="text-align: center"><span style="font-size: 30px"><b>Create Post</b></span></legend><br>
      <div style="text-align: left; font-size: 20px" >
        <label>Id User: </label>
        <input type="number" name="id"><br><br>
        <label>url image: </label>
        <input type="text" placeholder="url" name="urlImage"><br><br>
        <label>post: </label>
        <input type="text" placeholder="text" name="textPost"><br><br>
        <div style="text-align: center"><input type="submit" value="Create" style="font-size: 20px; width: 200px"></div>
      </div>
    </fieldset>
  </form>
</div>
</body>
</html>