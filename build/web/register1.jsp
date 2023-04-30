<%-- 
    Document   : register1
    Created on : 1 Feb, 2020, 8:59:24 PM
    Author     : kshit
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
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
     String username = request.getParameter("uname");
     session.putValue("uname",username);
     String firstname = request.getParameter("fname");
     String lastname = request.getParameter("lname");
     String password = request.getParameter("pass");
     String email = request.getParameter("email");
     String mob = request.getParameter("phonenumber"); 
     Class.forName("com.mysql.jdbc.Driver");
     java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
     Statement st=con.createStatement();
     ResultSet rs;
     int i=st.executeUpdate("insert into registration( `fname`, `lname`, `uname`, `email`, `mobno`, `pass`) values('"+firstname+"','"+lastname+"','"+username+"','"+email+"','"+mob+"','"+password+"')");
     response.sendRedirect("newjsp.jsp");
      }
      catch(Exception e){ 
          out.println(e);
      }
            
            %>
    </body>
</html>
