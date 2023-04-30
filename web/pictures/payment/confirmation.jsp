<%-- 
    Document   : confirmation
    Created on : 9 Feb, 2020, 4:41:14 PM
    Author     : kshit
--%>

<%@page import="java.sql.*"%>
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
  font-family: Arial;
  padding: 10px;
  background: #f1f1f1;
}

/* Header/Blog Title */
.header {
  padding: 30px;
  text-align: center;
  background: white;
}

.header h1 {
  font-size: 50px;
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

/* Create two unequal columns that floats next to each other */
/* Left column */
.leftcolumn {   
  float: left;
  width: 75%;
}

/* Right column */
.rightcolumn {
  float: left;
  width: 25%;
  background-color: #f1f1f1;
  padding-left: 20px;
}

/* Fake image */
.fakeimg {
  background-color: #aaa;
  width: 100%;
  padding: 20px;
}

/* Add a card effect for articles */
.card {
  background-color: white;
  padding: 20px;
  margin-top: 20px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Footer */
.footer {
  padding: 20px;
  text-align: center;
  background: #ddd;
  margin-top: 20px;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 800px) {
  .leftcolumn, .rightcolumn {   
    width: 100%;
    padding: 0;
  }
}

/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
  .topnav a {
    float: none;
    width: 100%;
  }
}
</style>
    </head>
    <body style="background-image: url(45649.jpg);">
        <div class="header">
  <h1>ORDER</h1>
</div>

<div class="topnav">
  
   <a href="../../homepage.jsp">GO BACK TO SHOPPING <<<</a>
</div>

<div class="row">
  <div class="leftcolumn">
    <div class="card">
        <%
         HttpSession login1=request.getSession(false);
              String userid1=(String)login1.getAttribute("usid");
              String userf1=(String)login1.getAttribute("fn");
              String userl1=(String)login1.getAttribute("ln");
        %>
      <h2>Order Success</h2>
      <h5>Your order has been placed succesfull <% out.println(userf1+""+userl1);%> </h5>
    </div>
  </div>
  <div class="rightcolumn">
    <div class="card">
      <h2>About Us</h2>
      
      <div  style="height:100px;"><img STYLE="height:100px ;width:300px  "src="../../logo1.jpg" alt=""/></div>
      <p>A perfect place to explore art work online and buy.</p>
    </div>
    <div class="card">
      <h3>Follow Us</h3>
      <p> kshitimhatre1@gmail.com</p>
    </div>
     
  </div>
</div>
        <%
        String h5=request.getParameter("hellokai");
        out.println(h5);
        if(h5.isEmpty()){
        %><script>window.blur();alert("Please Enter Address");window.location='payment.jsp';</script><%
       
        }
else{
        HttpSession login=request.getSession(false);  
        String usid=(String)login.getAttribute("usid");
        out.println(usid);
        HttpSession totalb=request.getSession(false); 
        int total=(Integer)totalb.getAttribute("totalid");
      
        out.println(total);
        try{
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         st.executeUpdate("insert into orderdetails( `ouid`, `oaddr`, `ototal`) values('"+usid+"','"+h5+"','"+total+"')");
        }
        catch(Exception e){
        System.out.println(e);
        }
}
        %>
    </body>
</html>
