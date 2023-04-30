<%-- 
    Document   : sketches
    Created on : 6 Jan, 2020, 8:56:02 PM
    Author     : kshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sketches</title>
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
  background:url(sketch1.jpg);
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
  <h1>SKETCHES </h1>
  
</div>

<div class="topnav">
  <a href="newjsp.jsp">Logout</a>
  <a href="homepage.jsp"> <<< Home</a>
</div>

<div class="row">
  <div class="column side">
  
  </div>
  
  <div class="column middle">
    <h2>Select Sketches</h2>
    <a class="popup" href="pictures/sketchesjsp/sketch1.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/s1.jpg" alt="" /><br>PRICE - 1000 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch2.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/s2.jpg" alt=""/><br>PRICE - 1500 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch3.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/s3.jpg" alt=""/><br>PRICE - 1720 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch4.jsp" class="previous"><img style="height:300px;width: 250px" src="pictures/images/s4.jpg" alt=""/><br>PRICE - 830 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch5.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/s5.jpg" alt=""/><br>PRICE - 800 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch6.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/s6.jpg" alt=""/><br>PRICE - 940 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch7.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/s7.jpg" alt=""/><br>PRICE - 1100 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch8.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/s8.jpg" alt=""/><br>PRICE - 1200 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch9.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/s9.jpg" alt=""/><br>PRICE - 2000 RS</a>
    <a class="popup" href="pictures/sketchesjsp/sketch10.jsp" class="previous"> <img style="height:300px;width: 250px" src="pictures/images/s10.jpg" alt=""/><br>PRICE - 1650 RS</a>
    
  </div>
  <form>
  <div class="column side">
    
     <% HttpSession login=request.getSession(false); 
        String userid=(String)login.getAttribute("usid");
        // out.println("idd"+userid);
     %>

    
    <p></p>
  </div>
   
  </form>    
</div>

<div class="footer">
  <p>Footer</p>
</div>
    </body>
    
</html>
