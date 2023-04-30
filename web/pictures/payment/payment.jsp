<%-- 
    Document   : payment
    Created on : 6 Feb, 2020, 12:44:53 AM
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
body {
  margin: 0;
}

/* Style the header */
.header {
  background-color: #f1f1f1;
  padding: 20px;
  text-align: center;
}
.topnav {
  overflow: hidden;
  background-color: black;
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
  width: 33.33%;
  padding: 15px;
}
.row:after {
  content: "";
  display: table;
  clear: both;
}
@media screen and (max-width:600px) {
  .column {
    width: 100%;
  }
}

</style>
    </head>
    <body style="background-image:url(pp1.jpg) ">
        
        <form action="confirmation.jsp">
            <div class="header" style="background-image:url(dd.jpg)">
            <h1 style="color:white">PAYMENT</h1>
            <a href=""></a>
            </div>
            <div class="topnav">
            <a href="../../newjsp.jsp">Logout</a>
            <a href="../cart/deletecart1.jsp"><<< Back</a>
            </div>
            <div class="row">
              <div class="column">
            
        <%
         int total=0;
         HttpSession login=request.getSession(false); 
         String userid1=(String)login.getAttribute("usid");
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from practise where usid='"+userid1+"'"); %>
          <table border="1" align="left" style="border-collapse:collapse"> 
              <thead>
             <tr style="background-color:black;color: white">
                 
                 <th>Product Name</th>
                 <th>Price</th>
                 <th style="max-height:500% ;max-width: 500%">Image</th>
             </tr>
         </thead>
              
              <tbody><%
         while(rs.next()){
           total+=rs.getInt("pprice");  %>
          
           <tr>
             <td style="color:white;font-size:18px;text-align:center;" ><%=rs.getString("pname")%></td>
             <td style="color:white"><%=rs.getInt("pprice")%></td>
             <td style="width:160px;height:200px"><img src="../images/<%=rs.getString("pimage")%>" style="max-height:100% ;max-width:100%"></td>
             </tr>
             
         <% }  %>
          </tbody>
          </table>
           </div>
          <div class="column"><p style="color:white;font-size:20px;">
                  
         <%
         out.println("Subtotal :"+total);         
         %>   </p>     
         <h3 style="color:white;">Your Address :</h3>
         <textarea id="hellokai" name="hellokai"></textarea>
         <hr>
         <h3 style="color:white;">
         STANDARD SHIPPING : RS 130<br>
         <b>PAYMENT METHOD</b>
            (Cash on delivery )
            Charges - 85
         <hr>
         Details
         <br>Retail price total : <strike><%=total+4955%></strike>
         <br>Subtotal :<%=total%>
         <br>Shipping price : 130
         <br>COD : 85
         <HR></h3>
         <h2 style="color:white;"><b>TOTAL :<%=total+130+85%></b></h2>
         <%
          
          HttpSession total1=request.getSession();
          total1.setAttribute("totalid",total);
         %>
         
         <div align="center">
             <button style="background-color:green;width:200px;height:50px;border-radius:12px;opacity:0.9;box-shadow:  0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19) ;align-content:center ;color:black;" value="CONTINUE PURCHASE" onclick="window.location.href='../../homepage.jsp';">CONFIRM</button>
            
         </div>
      
         
           </div>
            </div>
         
         
         </form>
    </body>
</html>
