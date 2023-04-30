<%-- 
    Document   : login1
    Created on : 1 Feb, 2020, 9:13:56 PM
    Author     : kshit
--%>

<%@page import="java.sql.*"%>
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
       String username=request.getParameter("uname");
       String password=request.getParameter("psw");
       try{
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         //for checking credentials for login
         ResultSet rs=st.executeQuery("select * from registration where uname='"+username+"' and pass='"+password+"'"); 
         //for checking existence of database
         //practiceeee
         //DatabaseMetaData dbm=con.getMetaData();
         //ResultSet tables=dbm.getTables(null,null,"practice",null);
         //practiceeeee
          //practiceee         
        // if(tables.next()){ //if table exist
            //dont do anythin   
         //}
         //else{
             
         //}
         
         //practice
         if(rs.next()){
           String  Username=rs.getString("uname");
           String  Password=rs.getString("pass");
           String name1=rs.getString("fname");
           String name2=rs.getString("lname");
           String userid=rs.getString("srno"); 
           String email=rs.getString("email");
           if(username.equals(Username)&&password.equals(Password)){
               HttpSession uid=request.getSession();
               uid.setAttribute("usid",userid);
               HttpSession s=request.getSession();
               s.setAttribute("fn", name1);
               HttpSession s1=request.getSession();
               s1.setAttribute("ln", name2);
               response.sendRedirect("homepage.jsp");
               HttpSession mail=request.getSession();
               mail.setAttribute("email",email);
           }
         }
         else{
           %>
           <jsp:forward page="newjsp.jsp"/>
           <%  
           
         }
       }
       catch(Exception e){
         out.println(e);   
       }
     %>
    </body>
</html>
