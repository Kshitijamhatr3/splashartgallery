<%-- 
    Document   : pointalism5
    Created on : 3 Feb, 2020, 12:52:00 AM
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
  background:url(../images/p1.jpg);
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
/*IMAGE ZOOM IN EFFECT*/
* {box-sizing: border-box;}

.img-zoom-container {
  position: relative;
}

.img-zoom-lens {
  position: absolute;
  border: 1px solid #d4d4d4;
  /*set the size of the lens:*/
  width: 40px;
  height: 40px;
}

.img-zoom-result {
  border: 1px solid #d4d4d4;
  /*set the size of the result div:*/
  width: 400px;
  height: 380px;
}
/* Style the footer */
.footer {
  background-color:black;
  padding: 10px;
  text-align: center;
  margin-top: 1000px;
}
</style>
<script>
function imageZoom(imgID, resultID) {
  var img, lens, result, cx, cy;
  img = document.getElementById(imgID);
  result = document.getElementById(resultID);
  /*create lens:*/
  lens = document.createElement("DIV");
  lens.setAttribute("class", "img-zoom-lens");
  /*insert lens:*/
  img.parentElement.insertBefore(lens, img);
  /*calculate the ratio between result DIV and lens:*/
  cx = result.offsetWidth / lens.offsetWidth;
  cy = result.offsetHeight / lens.offsetHeight;
  /*set background properties for the result DIV:*/
  result.style.backgroundImage = "url('" + img.src + "')";
  result.style.backgroundSize = (img.width * cx) + "px " + (img.height * cy) + "px";
  /*execute a function when someone moves the cursor over the image, or the lens:*/
  lens.addEventListener("mousemove", moveLens);
  img.addEventListener("mousemove", moveLens);
  /*and also for touch screens:*/
  lens.addEventListener("touchmove", moveLens);
  img.addEventListener("touchmove", moveLens);
  function moveLens(e) {
    var pos, x, y;
    /*prevent any other actions that may occur when moving over the image:*/
    e.preventDefault();
    /*get the cursor's x and y positions:*/
    pos = getCursorPos(e);
    /*calculate the position of the lens:*/
    x = pos.x - (lens.offsetWidth / 2);
    y = pos.y - (lens.offsetHeight / 2);
    /*prevent the lens from being positioned outside the image:*/
    if (x > img.width - lens.offsetWidth) {x = img.width - lens.offsetWidth;}
    if (x < 0) {x = 0;}
    if (y > img.height - lens.offsetHeight) {y = img.height - lens.offsetHeight;}
    if (y < 0) {y = 0;}
    /*set the position of the lens:*/
    lens.style.left = x + "px";
    lens.style.top = y + "px";
    /*display what the lens "sees":*/
    result.style.backgroundPosition = "-" + (x * cx) + "px -" + (y * cy) + "px";
  }
  function getCursorPos(e) {
    var a, x = 0, y = 0;
    e = e || window.event;
    /*get the x and y positions of the image:*/
    a = img.getBoundingClientRect();
    /*calculate the cursor's x and y coordinates, relative to the image:*/
    x = e.pageX - a.left;
    y = e.pageY - a.top;
    /*consider any page scrolling:*/
    x = x - window.pageXOffset;
    y = y - window.pageYOffset;
    return {x : x, y : y};
  }
}
</script>
    </head>
    <body>
         <form action="plogic5.jsp" method="post">
        <div class="header">
  <h1>POINTALISM ART</h1>
</div>

<div class="topnav">
  <a href="../../newjsp.jsp">Logout</a>
  <a href="../../pointalism.jsp"><<< Back</a>
</div>

  
  <div class="column middle">
    <h2>Bad Blood</h2>
    <div class="img-zoom-container">
    <img id="myimage" style="width:400px;height: 500px" src="../images/p5.jpg" alt=""/>
    <div id="myresult" class="img-zoom-result"></div>
    </div>
    <script>
     // Initiate zoom effect:
     imageZoom("myimage", "myresult");
    </script>
  </div>
  
  <div class="column side">
    <table>
    <tr>
    <td>
    <h1>Description</h1>
    <br><br><br>
    <h3>Category - Pointalism
    <br>Artist - Saina Jeas
    <br>Frames - Availabe
    <br>Size - 20.00 X 13.00 Inch 
    <br>Year - 2019
    </h3>
    <h2>Price - 2050 ISD </h2><br><br><br><br>
    <button class="button button1"><b>+</b>  ADD TO CART </button>
    
    
    </tr>
    </table>
  </div>
</div>

<div class="footer">
  <p>Footer</p>
</div>
    </form>>
    </body>
</html>
