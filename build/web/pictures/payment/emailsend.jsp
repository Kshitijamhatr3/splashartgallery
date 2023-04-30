<%-- 
    Document   : emailsend
    Created on : 7 Feb, 2020, 9:58:53 PM
    Author     : kshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
         HttpSession login=request.getSession(false); 
         String email=(String)login.getAttribute("email");
         out.println(email);
         String result;
         final String to=email;
         final String subject="Order conformation";
         final String messg="Order placed successfully";
         final String from="kshitijamhatreofficial@gmail.com";
         final String pass="";
         final String host = "smtp.gmail.com";
         Properties props = new Properties();
         props.put("mail.smtp.host", host);
         props.put("mail.transport.protocol", "smtp");
         props.put("mail.smtp.auth", "true");
         props.put("mail.smtp.starttls.enable", "true");
         props.put("mail.mail.smtp.ssl.enable","true"); 
         props.put("mail.user", from);
         props.put("mail.password", pass);
         props.put("mail.port", "465");
         
         Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, pass);
            }
        });
         try{
           MimeMessage message = new MimeMessage(mailSession);
           message.setFrom(new InternetAddress(from));
           message.addRecipient(Message.RecipientType.TO,
           new InternetAddress(to));
           message.setSubject(subject);
           message.setText(messg);
           Transport.send(message);
           result = "Your mail sent successfully....";
           out.println("done");
         }
         catch (Exception mex) {
        mex.printStackTrace();
        result = "Error: unable to send mail....";
           out.println("mex");
          }
       %>
    </body>
</html>
