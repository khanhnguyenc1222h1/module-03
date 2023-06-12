<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<html>--%>
<%--<head>--%>
<%--    <title>Login</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div align="center">--%>
<%--    <form method="post" action="/login">--%>
<%--        <fieldset style="width: 300px">--%>
<%--            <legend style="text-align: center"><span style="font-size: 30px"><b>Login</b></span></legend><br>--%>
<%--            <div style="text-align: left; font-size: 20px" >--%>
<%--                <label>username: </label>--%>
<%--                <input type="text" placeholder="username" name="username"><br><br>--%>
<%--                <label>password: </label>--%>
<%--                <input type="password" placeholder="password" name="password"><br><br>--%>
<%--                <div style="text-align: center"><input type="submit" value="Login" style="font-size: 20px; width: 200px"></div>--%>
<%--            </div>--%>
<%--        </fieldset>--%>
<%--    </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
<html>
<head>
    <meta charset='utf-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <title>Snippet - GoSNippets</title>
    <link href='https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css' rel='stylesheet'>
    <link href='' rel='stylesheet'>
    <style>@import url(https://fonts.googleapis.com/css?family=Roboto:300,400,700&display=swap);

    body {
        background: #f5f5f5;
    }

    @media only screen and (max-width: 767px) {
        .hide-on-mobile {
            display: none;
        }
    }

    .login-box {
        background: url(https://i.imgur.com/73BxBuI.png);
        background-size: cover;
        background-position: center;
        padding: 50px;
        margin: 50px auto;
        min-height: 700px;
        -webkit-box-shadow: 0 2px 60px -5px rgba(0, 0, 0, 0.1);
        box-shadow: 0 2px 60px -5px rgba(0, 0, 0, 0.1);
    }

    .logo {
        font-family: "Script MT";
        font-size: 54px;
        text-align: center;
        color: #888888;
        margin-bottom: 50px;
    }

    .logo .logo-font {
        color: #3BC3FF;
    }

    @media only screen and (max-width: 767px) {
        .logo {
            font-size: 34px;
        }
    }

    .header-title {
        text-align: center;
        margin-bottom: 50px;
    }

    .login-form {
        max-width: 300px;
        margin: 0 auto;
    }

    .login-form .form-control {
        border-radius: 0;
        margin-bottom: 30px;
    }

    .login-form .form-group {
        position: relative;
    }

    .login-form .form-group .forgot-password {
        position: absolute;
        top: 6px;
        right: 15px;
    }

    .login-form .btn {
        border-radius: 0;
        -webkit-box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        margin-bottom: 30px;
    }

    .login-form .btn.btn-primary {
        background: #3BC3FF;
        border-color: #31c0ff;
    }

    .slider-feature-card {
        background: #fff;
        max-width: 280px;
        margin: 0 auto;
        padding: 30px;
        text-align: center;
        -webkit-box-shadow: 0 2px 25px -3px rgba(0, 0, 0, 0.1);
        box-shadow: 0 2px 25px -3px rgba(0, 0, 0, 0.1);
    }

    .slider-feature-card img {
        height: 80px;
        margin-top: 30px;
        margin-bottom: 30px;
    }

    .slider-feature-card h3,
    .slider-feature-card p {
        margin-bottom: 30px;
    }

    .carousel-indicators {
        bottom: -50px;
    }

    .carousel-indicators li {
        cursor: pointer;
    }</style>
    <script type='text/javascript' src=''></script>
    <script type='text/javascript' src='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js'></script>
    <script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js'></script>
</head>
<body oncontextmenu='return false' class='snippet-body'>
<section class="body">
    <div class="container">
        <div class="login-box">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        <span class="logo-font">Friend</span>lio
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <br>
                    <h3 class="header-title">LOGIN</h3>
                    <form class="login-form" method="post" action="/login" >
                        <div style="color: red"><c:out value="${mess}"/></div>
                        <div class="form-group">
                            <input type="text" class="form-control" name="email" placeholder="Email" required="required" value="${messE}">
                        </div>
                        <div class="form-group">
                            <input type="Password" class="form-control" name="password"  placeholder="Password" required="required">
                            <a href="#!" class="forgot-password"></a>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-primary btn-block">LOGIN</button>
                        </div>
                        <div class="form-group">
                            <div class="text-center">New Member? <a href="/register">Sign up Now</a></div>
                        </div>
                    </form>
                </div>
                <div class="col-sm-6 hide-on-mobile">
                    <div id="demo" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ul class="carousel-indicators">
                            <li data-target="#demo" data-slide-to="0" class="active"></li>
                            <li data-target="#demo" data-slide-to="1"></li>
                        </ul>
                        <!-- The slideshow -->
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <div class="slider-feature-card">
                                    <img src="https://i.imgur.com/YMn8Xo1.png" alt="">
                                    <h3 class="slider-title">Title Here</h3>
                                    <p class="slider-description">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iure, odio!</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <div class="slider-feature-card">
                                    <img src="https://i.imgur.com/Yi5KXKM.png" alt="">
                                    <h3 class="slider-title">Title Here</h3>
                                    <p class="slider-description">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ratione, debitis?</p>
                                </div>
                            </div>
                        </div>
                        <!-- Left and right controls -->
                        <a class="carousel-control-prev" href="#demo" data-slide="prev">
                            <span class="carousel-control-prev-icon"></span>
                        </a>
                        <a class="carousel-control-next" href="#demo" data-slide="next">
                            <span class="carousel-control-next-icon"></span>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<script type='text/javascript'></script>
</body>
</html>