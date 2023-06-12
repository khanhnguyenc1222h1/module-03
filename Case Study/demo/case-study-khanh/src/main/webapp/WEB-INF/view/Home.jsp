<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/04/2023
  Time: 9:29 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"></script>
<head>
    <title>Home</title>
</head>
<body>
<header class="justify-content-between d-flex ">
    <div class="d-infine-flex m-3">
        <a class="h3 nav-link"><b>MyBlog</b></a>
    </div>
    <div class="d-infine-flex justify-content-between me-5" style="padding-top: 30px;">
        <div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">

            <form class="d-flex" method="get" action="/login">
                <input type="submit" class="btn-check" id="btncheck1" autocomplete="off">
                <label class="btn btn-outline-primary me-2" for="btncheck1">Login</label>
            </form>
            <form class="d-flex" method="get" action="/register">
                <input type="submit" class="btn-check" id="btncheck2" autocomplete="off">
                <label class="btn btn-outline-primary me-2" for="btncheck2">Register</label>
            </form>
        </div>
    </div>
    </form>
</header>

<div class="container-fluid col-md-10">
    <main>
        <div class="row">
                <div class="card col-sm-3 m-1"
                     style="float: left;background-color: burlywood;padding-top: 10px;width: 300px">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmfq4JGhTuTaBDriCKmpuSpbzhutZuxzMrAw&usqp=CAU" class="card-img-top"
                         alt="...">
                    <div class="card-body">
                        <p class="card-text">Mạng xã hội</p>
                    </div>
                </div>
        </div>
    </main>
</div>

<footer style="background-color: greenyellow; height: 30px">
    <div style="text-align: center">
        © 2023 by My Blog. Powered and secured by Wix
    </div>
</footer>
</body>
</html>
