<%-- 
    Document   : newjsp
    Created on : 30 Dec, 2019, 7:54:11 PM
    Author     : kshit
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="com.mysql.jdbc.jdbc2.optional.MysqlDataSource" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.util.logging.Logger" %>
<%@page import="java.util.logging.Level" %>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      <style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  background-image: url("paint-bright-blurred-yellow-wallpaper.jpg");

  min-height: 500px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 20px;
  max-width: 300px;
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>  
</head>
<body>   
<div class="bg-img">
  <form class="container" action="login1.jsp">
    <h1>Login</h1>

    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit" class="btn" name="login" value="Y">Login</button>
    <h6>Don't have an account yet ?<br>
    <a href='registrationform.jsp'>CLICK HERE</a> to create a new account</h6>
  </form>
</div>
    </body>
</html>