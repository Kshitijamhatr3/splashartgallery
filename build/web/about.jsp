<%-- 
    Document   : about
    Created on : 12 Feb, 2020, 1:48:19 AM
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
  background-color: black;
  padding: 20px;
  text-align: center;
  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;
  position: sticky;
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
  width: 70%;
}

/* Middle column */
.column.middle {
  width: 30%;
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
/*add to cart button*/
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
.footer {
  background-color:black;
  padding: 10px;
  text-align: center;
  margin-top: 1000px;
}
</style>
    </head>
    <body>
        <form>
            <div class="header">
  <h1>About Us</h1>
</div>

<div class="topnav">
  <a href="newjsp.jsp">Logout</a>
  <a href="homepage.jsp"><<< Back</a>
 
</div>
            <div claass =row>
                <h1>SPLASH ART GALLERY</h1>  <hr>
                <H3>A Place to buy art </h3>
                <br><br>
                <p>Splash art gallery is a place where you can buy art of different types. We provide an online platform for art 
                
               lovers to explore art and buy them. We also have a unique category of custom art where
                the customers can customize their favourite art on various items like cup ,pillow,diary,etc and buy them .</p>
                
                
            </div>    
            <div class="footer"></div>
            
         
      </form>  
    </body>
</html>
