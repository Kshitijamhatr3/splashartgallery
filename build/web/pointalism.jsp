<%-- 
    Document   : pointalism
    Created on : 7 Jan, 2020, 2:26:02 AM
    Author     : kshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     <style>
* {
  box-sizing: border-box;
}

body {
  margin: 0;
}

/* Style the header */
.header {
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
  color: orange;
  background:url(pictures/images/p1.jpg);
  padding: 20px;
  text-align: center;
  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Create three unequal columns that floats next to each other */
.column {
  float: left;
  padding: 10px;
}

/* Left and right column */
.column.side {
  width: 15%;
}

/* Middle column */
.column.middle {
  width: 70%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .column.side, .column.middle {
    width: 100%;
  }
}

/* Style the footer */
.footer {
  background-color:black;
  padding: 10px;
  text-align: center;
  margin-top: 800px;
}
/* image pop up*/
a.popup {
  text-decoration: none;
  display: inline-block;
  padding: 8px 16px;
}

a.popup:hover {
  background-color: #ddd;
  color: black;
}

.previous {
  background-color: #f1f1f1;
  color: black;
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
  cursor: pointer;
}

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid orange;
}

.button1:hover {
  background-color: orange;
  color: white;
}
</style>  
    </head>
    <body>
   <div class="header">
  <h1>POINTALISM </h1>
  
</div>

<div class="topnav">
  <a href="newjsp.jsp">Login</a>
  <a href="registrationform.jsp">SignUp</a>
  <a href="homepage.jsp"> <<< Home</a>
</div>

<div class="row">
  <div class="column side">
    
  </div>
  
  <div class="column middle">
    <h2>Select Pointalism Art Pieces</h2>
    <a class="popup" href="pictures/pointalismjsp/pointalism1.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/p1.jpg" alt="" /><br>PRICE - 2700 RS</a>
    <a class="popup" href="pictures/pointalismjsp/pointalism2.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/p2.jpg" alt=""/><br>PRICE - 5000 RS</a>
    <a class="popup" href="pictures/pointalismjsp/pointalism4.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/p7.jpg" alt=""/><br>PRICE - 1600 RS</a>
    <a class="popup" href="pictures/pointalismjsp/pointalism3.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/p3.jpg" alt=""/><br>PRICE - 4890 RS</a>
    <a class="popup" href="pictures/pointalismjsp/pointalism5.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/p5.jpg" alt=""/><br>PRICE - 2050 RS</a>
    <a class="popup" href="pictures/pointalismjsp/pointalism6.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/p6.jpg" alt=""/><br>PRICE - 4200 RS</a>
  </div>
  <form>
  <div class="column side">
  </div>
  </form>    
</div>

<div class="footer">
  <p>Footer</p>
</div>     
    </body>
</html>
