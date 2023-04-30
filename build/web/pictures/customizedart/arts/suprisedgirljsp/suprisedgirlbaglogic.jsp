<%-- 
    Document   : suprisedgirlbaglogic
    Created on : 12 Feb, 2020, 7:30:46 PM
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
            HttpSession s1=request.getSession(false);
            String userf=(String)s1.getAttribute("fn");
            String userl=(String)s1.getAttribute("ln");
            String quan1t=(String)s1.getAttribute("quant");
             out.println(quan1t);
            %><p style="font-family:sans-serif;font-size:40px"><b><marquee><%=userf+" "+userl%>'s Cart</marquee></b></p><%
            try{
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         HttpSession login=request.getSession(false); 
         String userid1=(String)login.getAttribute("usid");
         int userid=Integer.parseInt(userid1);
         ResultSet rs=st.executeQuery("select * from artgallery.allproduct where pid='36'"); 
         if(rs.next()){
         int exist;
         int  pid=rs.getInt("pid");
         int  pprice=rs.getInt("pprice");
         int  pquant=rs.getInt("pquant");
         String ppic=rs.getString("ppic");
         String pname=rs.getString("pname");
         Statement stt=con.createStatement();
         /*Statement ss3=con.createStatement();
         ResultSet rs3=st.executeQuery("select * from artgallery.practise where usid='"+userid+"'"); 
         while(rs3.next()){
         exist=rs3.getInt("pid");
         ResultSet result=st.executeQuery("select * from artgallery.practise where usid='"+userid+"'"); 
         if(pid==exist){
             out.println("product already exist");
         }
         else{
         int i=stm.executeUpdate("insert into practise( `usid`, `pid`, `pname`, `pquant`, `pimage`, `pprice`) values('"+userid+"','"+pid+"','"+pname+"','"+pquant+"','"+ppic+"','"+pprice+"')");
         }}*/
         
         Statement stm=con.createStatement();
         /*
          ResultSet result=stt.executeQuery("select * from artgallery.practise where usid='"+userid+"'");
         if(result.next()){
             out.println("<script type='text/javascript'>alert('product already exist');</script>");
         }
         else{}*/
         int i=stm.executeUpdate("insert into practise( `usid`, `pid`, `pname`, `pquant`, `pimage`, `pprice`) values('"+userid+"','"+pid+"','"+pname+"','"+pquant+"','"+ppic+"','"+pprice+"')");
         
         ResultSet rs2=st.executeQuery("select * from artgallery.practise where usid='"+userid+"'"); 
         %>
            
       
            <table border="1" align="center" style="border-collapse:collapse">
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
             
             %>
         <tr>
             <td><%=rs2.getInt("pid")%></td>
             <td><%=rs2.getString("pname")%></td>
             <td><%=rs2.getInt("pquant")%></td>
             <td><%=rs2.getInt("pprice")%></td>
             <td style="width:160px;height:200px"><img src="../../../images/<%=rs2.getString("pimage")%>" style="max-height:100% ;max-width:100%"></td>
             <% /*
              int a1=rs2.getInt("pid");
              Statement si=con.createStatement();
              si.executeUpdate("insert into deleteval(`delid`) values ('"+a1+"')");
              */
             %>
             <td><a href="../../../cart/deletecart1.jsp?p_id=<%=rs2.getInt("pid")%>">delete</a></td>
             
         
        
         </tr>
         <%
         }%>
         </tbody>
         </table><br>

            <div align="center"><button style="background-color:green;width:200px;height:50px;border-radius:12px;opacity:0.9;box-shadow:  0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19) ;align-content:center ;color:WHITE" value="GO BACK SHOPPING" onclick="window.location.href='../../../../homepage.jsp';">GO BACK SHOPPING</button></div>
            <BR><div align="center"><button style="background-color:violet;width:200px;height:50px;border-radius:12px;opacity:0.9;box-shadow:  0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19) ;align-content:center ;color:black" value="CHECKOUT" onclick="window.location.href='../../../payment/payment.jsp';">CHECKOUT</button></div>
           
            <%
         }}
         
         catch(Exception e){
          out.println(e.toString());
          }
          
         %>
        
    </body>
</html>
