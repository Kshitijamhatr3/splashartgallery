<%-- 
    Document   : customizedart
    Created on : 9 Feb, 2020, 10:36:41 PM
    Author     : kshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style>
        .header {
                 background-image:url(p.jfif);
                 padding: 20px;
                 text-align: center;
                 color:white;
                  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;
                }
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
                
                .column {
        float: left;
       padding: 10px;
}

/* Left and right column */
.column.side {
  width: 2.8%;
}

/* Middle column */
.column.middle {
  width: 90%;
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
                    /* Style the footer */
            .footer {
                background-color: #f1f1f1;
                padding: 10px;
                text-align: center;
                    }
                    
    </style>
    </head>
    <body>
    <div class="header">
      <h1>CUSTOMIZED ART</h1>
    </div>
    <div class="topnav">
      <a href="../../newjsp.jsp">Logout</a>
  <a href="../../homepage.jsp"><<< Back</a>
    </div> 
  <div class="row">
  <div class="column side" style="background-color:black;">
    <h2>Side</h2>
    .<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br><br>.<br>.<br>
    .<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>
  </div>
  
  <div style="background-color:black;"class="column middle">
      <h2 style="color:white">Select An Art Sample For Customized Products</h2><hr>
    <a class="popup" href="arts/joker.jsp" class="previous"><img style="height:300px;width: 250px" src="jjj.jpg" alt="" /><br></a>
    <a class="popup" href="arts/suprisedgirl.jsp" class="previous"><img style="height:300px;width: 250px" src="kkk.jpg" alt=""/><br></a>
    <a class="popup" href="arts/moderngirl.jsp" class="previous"><img style="height:300px;width: 250px" src="eee.jpg" alt=""/><br></a>
    <a class="popup" href="arts/popgirl.jsp" class="previous"><img style="height:300px;width: 250px" src="aaa.jpg" alt=""/><br></a>
    <a class="popup" href="arts/poplips.jsp" class="previous"> <img style="height:300px;width: 250px" src="bbb.jpg" alt=""/><br></a>
  </div>
  
  <div style="background-color:black;"class="column side">
    <h2>Side</h2>
    .<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br><br>.<br>.<br>
    .<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>.<br>
  </div>
</div>
    <div class="footer">
  <p>Footer</p>
    </div>
    </body>
</html>
