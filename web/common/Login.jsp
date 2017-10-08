<!-- 
    Document   : Login
    Author     : Arunabha
    Group      : C2 
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
                body {
                        background-image: url("http://robocode.sourceforge.net/home/robocode_logo_white.jpg");
                        background-repeat: no-repeat;
                        background-position: 0 0;
                        background-size: cover;
                        color: blue;
                }
                div {
                        position : absolute;
                        top : 50%;
                        left:90%;
                        transform:translate(-50%,-50%);
                }
                h1 {
                        color : green;
                        text-align : left;
                        font-size: 50px;
                }
                h2 {
                        color : black;
                        text-align:centre;
                        font-family: sans-serif;
                        font-size: 30px;
                }
                input {
                        display: block;
                        width: 320px;
                        height: 40px;
                        padding: 5px;
                        font-size: 20px;
                        font-family : sans-serif;
                        color: blue;
                        outline: none;
                        border: 1px solid rgba(0,0,0,0.3);
                        border-radius: 5px;
                        margin-bottom: 2px;
                }
        </style>
    </head>
    <body>
        <h1 >Login page</h1>
        <div id="login">
                <h2>SIGN IN</h2>
                <form action="LoginCheck.jsp" method="post">
                Username <input type="text" name= "username" value="">
                <br/>Password <input type="password" name="password" value="">
                <br/><input type="submit" value="Submit">
                </form>
                <br/>
                <h2>REGISTER</h2>
                <form action="UserRegister.jsp" method="post">
                Username <input type="text" name="username">
                <br/>Choose Password <input type="password" name="password1">
                <br/>Confirm Password <input type="password" name="password2">
                <br/>Email Address <input type="text" name="email">
                <br/><input type="submit" value="Submit">
                </form>
        </div>
    </body>
</html>
