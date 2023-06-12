<%@ page import="java.io.Writer" %>
<%@ page import="java.io.FileWriter" %><%--
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
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<head>
    <title>Show Post</title>
</head>
<body>
<header class="justify-content-between d-flex ">
    <div class="d-infine-flex m-3">
        <a class="h3 nav-link" href="/home"><b>MyBlog</b></a>
    </div>
    <div class="d-flex">
        <div class="d-infine-flex justify-content-between me-5" style="padding-top: 30px;">
            <div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">
                <label class="btn me-3"><a href="/add">add</a></label>
            </div>
        </div>
    </div>
</header>

<div class="container-fluid col-md-10">
    <main>
        <div class="row">
            <c:forEach var="x" items="${postS}">
                <div class="card col-sm-3 m-1"
                     style="float: left;background-color: burlywood;padding-top: 10px;width: 300px">
                    <img src="<c:out value='${x.urlImage}'/>" class="card-img-top" alt="...">
                    <div class="card-body">
                        <p class="card-text"><c:out value='${x.textPost}'/></p>
                    </div>
                    <a href="/update?pid=${x.id}">update</a>
                    <a href="#" onclick="showMess(${x.id})">delete</a>
                </div>
            </c:forEach>
        </div>
    </main>
</div>

<footer style="background-color: greenyellow; height: 30px">
    <div style="text-align: center">
        © 2023 by My Blog. Powered and secured by Wix
    </div>
</footer>
<script type="text/javascript">
    function showMess(id){
        var option = confirm("are you sure to delete");
        if(option === true){
            window.location.href = '/delete?pid='+id;
        }
    }
</script>
</body>
</html>
