<%-- 
    Document   : homepage
    Created on : 5 Jan, 2020, 6:54:22 PM
    Author     : kshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="w3.css">
        <title>JSP Page</title>
    <style>
body {
  margin: 0;
}
/* Style the header */
.header {
  color:white;
  background-color: black;
  padding: 40px;
  text-align: center;
 
}
* {
  box-sizing: border-box;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color:orange;
  
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 5px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
 
}
/* Create three equal columns that floats next to each other */
.column {
  float: left;
  width: 33.33%;
  padding: 15px;
}
.column1{
 float: left;
  width: 33.33%;
  padding: 15px;   
}


/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width:600px) {
  .column {
    width: 100%;
  }
}
.footer {
  padding: 20px;
  text-align: center;
  background: black;
  margin-top: 800px;
}
.animation1 {
  /* Standard syntax */
  position: absolute;
  animation-name: example;
  animation-duration: 5s;
  animation-timing-function: linear;
  animation-delay: 2s;
  animation-iteration-count: infinite;
  animation-direction: alternate;
}
  @keyframes example {
  0%   {background-color:black; left:0px; top:0px;}
  25%  {background-color:black; left:50px; top:0px;}

  100% {background-color:black; left:0px; top:0px;}
}
#dropdown
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

li.dropdown {
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1;}

.dropdown:hover .dropdown-content {
  display: block;
}
#moving images
.mySlides1 {display:none;}
/*customized*/
.mySlides1 {display:none}
.w3-left, .w3-right, .w3-badge {cursor:pointer}
.w3-badge {height:13px;width:13px;padding:0}


</style>   

    </head>
    <body background="home1.jpg">
        <form action="customizedart.jsp" method="POST" name="frm" enctype="multipart/form-data">
        <div class="header" ><img align="left" src="logo1.jpg" style="width:180px;height:87.5px;"></div>
        <div class="topnav">
        <ul> 
       
         <li style="float:right"><%
              HttpSession login=request.getSession(false);
              String userid=(String)login.getAttribute("usid");
              String userf=(String)login.getAttribute("fn");
              String userl=(String)login.getAttribute("ln");
              //String uid=(String)login.getAttribute("usid");
              out.println("Hello "+"  "+userf+" "+userl+" "+", Welcome");
               HttpSession s1=request.getSession();
               s1.setAttribute("usid",userid);
               
             %>
         <li><a href="newjsp.jsp">Logout</a>
         
         <li class="dropdown">
          <a href="javascript:void(0)" class="dropbtn">Categories</a>
         <div class="dropdown-content">
            <a href="sketches.jsp">Sketches</a>
            <a href="cubism.jsp">Cubism</a>
            <a href="pointalism.jsp">Pointalism</a>
            <a href="fluidart.jsp">Fluid art</a>
         </div>
         </li>
         <li><a href="pictures/customizedart/customizedart.jsp">Customs</a>
         <li><a href="about.jsp">About</a>
         <li><a href="contact.jsp">Contact</a>
         <li><a href="pictures/cart/deletecart1.jsp">My Cart</a>
             
         </ul>
           
        </div>
   
        <div style="background-color:black;" class="row">
  
  
            <div style="background-color:black;"class="column">
    <h2 style="color:white;">ARTWORKS</h2>
<div style="width:500px;height:500px" class="w3-content w3-section" style="max-width:2000px">
  <a href="pictures/pointalismjsp/pointalism2.jsp"><img style="width:460px;height:500px" class="mySlides" src="pictures/images/p2.jpg" style="width:100%"></a>
  <a href="pictures/cubismjsp/cubism3.jsp"><img style="width:460px;height:500px" class="mySlides" src="pictures/images/c3.jpg" style="width:100%" alt="kaira"></a>
  <a href="pictures/fluidartjsp/fluid3.jsp"><img style="width:460px;height:500px" class="mySlides" src="pictures/images/f3.jpg" style="width:100%" alt="hello"></a>
  <a href="pictures/sketchesjsp/sketch2.jsp"><img style="width:460px;height:500px" class="mySlides" src="pictures/images/s2.jpg" style="width:100%" alt="hello"></a>
</div>
<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script> 
  </div>
  
  <div class="column">
    

     
  </div>
  
  <div style="background-color:grey;"  class="column1">
   <h2>CUSTOMIZED ART PRODUCTS</h2>
   <div class="w3-container">
</div>
<div class="w3-content w3-display-container" style="max-width:800px">
    <a href="pictures/customizedart/arts/moderngirl.jsp">
  <img class="mySlides1" src="pictures/customizedart/eee.jpg" style="width:480px;height: 500px;"></a>

    <a href="pictures/customizedart/arts/joker.jsp">
  <img class="mySlides1" src="pictures/customizedart/jjj.jpg" style="width:480px;height: 500px;"></a>
  <a href="pictures/customizedart/arts/suprisedgirl.jsp">
  <img class="mySlides1" src="pictures/customizedart/kkk.jpg" style="width:480px;height: 500px;"></a>
    <div class="w3-center w3-container w3-section w3-large w3-text-white w3-display-bottommiddle" style="width:100%">
    <div class="w3-left w3-hover-text-khaki" onclick="plusDivs(-1)">&#10094;</div>
    <div class="w3-right w3-hover-text-khaki" onclick="plusDivs(1)">&#10095;</div>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(1)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(2)"></span>
    <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(3)"></span>
  </div>
</div>

<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides1");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" w3-white", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-white";
}
</script>
  </div>
</div>
<div class="footer">
  <h2>Footer</h2>
</div>
 </form>
    </body>
</html>
