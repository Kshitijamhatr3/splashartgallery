<%-- 
    Document   : deletecart1
    Created on : 5 Feb, 2020, 11:28:47 PM
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
  margin: 0;
}

/* Style the header */
.header {
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
  color: orange;
  background-color: #e91e63;
  padding: 20px;
  text-align: center;
  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;
  position: sticky;
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
</style>
    </head>
    <body>
        <div class="header">
  <h1>Cart</h1>
</div>

<div class="topnav">

  <a href="../../newjsp.jsp">Logout</a>
  <a href="../../homepage.jsp"><<< Back</a>
</div>
        <%
        try{
        HttpSession login=request.getSession(false); 
         String userid1=(String)login.getAttribute("usid");
         int userid=Integer.parseInt(userid1);
        String p_id=request.getParameter("p_id");
        Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         String d1="delete from practise where pid='"+p_id+"' ";
         PreparedStatement cart=con.prepareStatement(d1);
         cart.executeUpdate();
         ResultSet rs2=st.executeQuery("select * from artgallery.practise where usid='"+userid+"'"); 
          %><table border="1" align="center" style="border-collapse:collapse">
         <thead>
             <tr style="background-color:black;color: white">
                 <th>Product ID</th>
                 <th>Product Name</th>
                
                 <th>Price</th>
                 <th style="max-height:500% ;max-width: 500%">Image</th>
                 <th>Discard</th>
             </tr>
         </thead>
         <tbody>
         <%
         while(rs2.next()){
          %>  
          <% int productid=rs2.getInt("pid");
                HttpSession prod=request.getSession();
               prod.setAttribute("pdid",productid);
               
             %>
         <tr>
             
             <td><%=rs2.getInt("pid")%></td>
             <td><%=rs2.getString("pname")%></td>
             
             <td><%=rs2.getInt("pprice")%></td>
             <td style="width:160px;height:200px"><img src="../images/<%=rs2.getString("pimage")%>" style="max-height:100% ;max-width:100%"></td>
              <td><a href="../cart/deletecart1.jsp?p_id=<%=rs2.getInt("pid")%>">delete</a></td>
            
         </tr>
         <%
         }%>
         </tbody>
         </table>
         <div align="center"><button style="background-color:green;width:200px;height:50px;border-radius:12px;opacity:0.9;box-shadow:  0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19) ;align-content:center ;color:black" value="GO BACK SHOPPING" onclick="window.location.href='../../homepage.jsp';">GO BACK SHOPPING</button></div>
         <BR><div align="center"><button style="background-color:violet;width:200px;height:50px;border-radius:12px;opacity:0.9;box-shadow:  0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19) ;align-content:center ;color:black" value="CHECKOUT" onclick="window.location.href='../payment/payment.jsp';">CHECKOUT</button></div>
         <%
         }
        catch(Exception e){
          System.out.println(e);  
        }
         
       //  response.sendRedirect("tryit.jsp");
        %>
    </body>
</html>
