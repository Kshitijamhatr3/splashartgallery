<%-- 
    Document   : deletecart
    Created on : 5 Feb, 2020, 12:40:42 AM
    Author     : kshit
--%>


<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
     try{
         HttpSession login=request.getSession(false); 
         String userid1=(String)login.getAttribute("usid");
         int userid=Integer.parseInt(userid1);
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from deleteval"); 
         while(rs.next()){
         int a=rs.getInt("delid");
         Statement stt=con.createStatement();
         //practise 
         stt.execute("delete from practise where pid='"+a+"' ");
         out.println("deleted");
          ResultSet rs2=st.executeQuery("select * from artgallery.practise where usid='"+userid+"'"); 
          %><table border="1" align="center" style="border-collapse:collapse">
         <thead>
             <tr style="background-color:black;color: white">
                 <th>Product ID</th>
                 <th>Product Name</th>
                 <th>Quantity</th>
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
               out.println(productid+"------");
                out.println(productid+"------");
             %>
         <tr>
             
             <td><%=rs2.getInt("pid")%></td>
             <td><%=rs2.getString("pname")%></td>
             <td><%=rs2.getInt("pquant")%></td>
             <td><%=rs2.getInt("pprice")%></td>
             <td style="width:160px;height:200px"><img src="../images/<%=rs2.getString("pimage")%>" style="max-height:100% ;max-width:100%"></td>
             <%
              int a1=rs2.getInt("pid");
              Statement si=con.createStatement();
              si.executeUpdate("insert into deleteval(`delid`) values ('"+a1+"')"); %>
             <td><a href="../cart/deletecart.jsp"> Delete</a></td>
         
            
         </tr>
         <%
         }%>
         </tbody>
         </table><%
         }
         %>alert("deleted succesfully");<%
}
     catch(Exception e){
          System.out.println(e.toString());
          }
        
        %>
    </body>
</html>
