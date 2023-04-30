<%-- 
    Document   : registrationform
    Created on : 5 Jan, 2020, 1:20:20 PM
    Author     : kshit
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.http.HttpServlet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> REGISTRATION FORM</title>
     <style> 
div {
  width: 800px;
  height: 25px;
  border-radius: 25px;
  background-color: red;
  position: relative;
  -webkit-animation-name: example; /* Safari 4.0 - 8.0 */
  -webkit-animation-duration: 10s; /* Safari 4.0 - 8.0 */
  -webkit-animation-iteration-count: 100; /* Safari 4.0 - 8.0 */
  animation-name: example;
  animation-duration: 10s;
  animation-iteration-count: 100;
}
.container{
    position: absolute;
  right: 0;
  margin: 20px;
  max-width: 400px;
  padding: 16px;
  background-color: white;
}

/* Safari 4.0 - 8.0 */
@-webkit-keyframes example {
  0%   {background-color:red; left:0px; top:0px;}
  25%  {background-color:yellow; left:200px; top:0px;}
  100% {background-color:pink; left:0px; top:0px;}
}

/* Standard syntax */
@keyframes example {
  0%   {background-color:red; left:0px; top:0px;}
  25%  {background-color:yellow; left:300px; top:0px;}
  100% {background-color:yellowgreen; left:0px; top:0px;}
}
</style>  
<script> 
function regex()								 
{ 	
var fname = document.forms["RegForm"]["fname"];
var lname = document.forms["RegForm"]["lname"];
var email = document.forms["RegForm"]["email"];
var phn = document.forms["RegForm"]["phonenumber"];
var uname = document.forms["RegForm"]["uname"];
var pass = document.forms["RegForm"]["pass"];
var cpass = document.forms["RegForm"]["cpass"];
var regex = /^[a-zA-Z ]{2,30}$/;
var emailregex= /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
var phnregex=/^[2-9]{2}[0-9]{8}$/;
var unameregex=/^[a-z0-9_-]{3,15}$/;
var passregex=/^(?=.*\d).{4,8}$/;
if (fname.value == "" || lname.value=="" || email.value=="" || phn.value=="" || uname.value=="" || pass.value=="" || cpass.value=="")							 
	{ 
		window.alert("Fields cannot be empty"); 
		fname.focus(); 
                uname.focus(); 
                lname.focus(); 
                email.focus(); 
                phn.focus(); 
                pass.focus(); 
                cpass.focus(); 
		return false; 
	} 
  else if (!regex.test(fname.value)) {
      window.alert("Invalid Input for First Name"); 
      return false;
    }
  else if (!regex.test(lname.value)) {
      window.alert("Invalid Input for Last Name"); 
      return false;
    }
  else if (!emailregex.test(email.value)) {
      window.alert("Invalid Input for Email"); 
      return false;
    }
  else if (!phnregex.test(phn.value)) {
      window.alert("Invalid Input for Phone number"); 
      return false;
    }
  else if (!unameregex.test(uname.value)) {
      window.alert("Invalid Input for Username"); 
      return false;
    }
  else if (pass.value!=cpass.value) {
      window.alert("Password didn't matched"); 
      return false;
    }
    //The password's first character must be a letter, it must contain at least 4 characters and no more than 15 characters and no characters other than letters, numbers and the underscore may be used
  else if (!passregex.test(pass.value)) {
      window.alert("Password must be between 4 and 8 digits long and include at least one numeric digit."); 
      return false;
    }
  else if (!passregex.test(cpass.value)) {
      window.alert("Password expression. Password must be between 4 and 8 digits long and include at least one numeric digit."); 
      return false;
    } 
  else{
  return true;
  }
}
</script>
    </head>
    <body background="paint-bright-blurred-yellow-wallpaper.jpg">
    <form name="RegForm" action="register1.jsp" method="POST" class="container" onsubmit="return regex()">
        <b><h1 style="font-family:Cambria ; color:black ;">SIGN UP </h1></b>    
        <center>
        <div></div>    
            <table cellspacing="10" img="LP2Ov5.jpg">
            <tbody>              
                <tr>
                    <td><b>FIRST NAME</b></td>
                </tr>
                <tr>
                    <td><input type="text" placeholder="First Name" name="fname" style=" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;"></td>
                </tr>
                <tr>
                    <td><b>LAST NAME</b></td>
                </tr>
                <tr>   
                    <td><input type="text" placeholder="Last Name" name="lname" style=" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;"></td>
                </tr>
                <tr>
                    <td><b>EMAIL</b></td>
                </tr>
                <tr>
                    <td><input type="text" placeholder="Email" name="email" style=" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;"></td>
                </tr>
                <tr>
                    <td><b>PHONE NUMBER</b></td>
                </tr>
                <tr>
                    <td><input type="text" placeholder="Phone Number" name="phonenumber" style=" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;"></td>
                </tr>
                <tr>
                    <td><b>USER NAME</b></td>
                </tr>
                <tr>
                    <td><input type="text" placeholder="User Name" name="uname" style=" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;"></td>
                </tr>
                <tr>
                    <td><b>PASSWORD</b></td>
                </tr>
                <tr>
                    <td><input type="password" placeholder="Password" name="pass" value="" style=" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;" /></td>
                </tr>
                <tr>
                    <td><b>CONFIRM PASSWORD</b></td>
                </tr>
                <tr>
                    <td><input type="password" placeholder="Confirm Password" name="cpass" value="" style=" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;"/></td>
                </tr>
            </tbody>
        </table>
            <div></div>
        </center>
        <br>
        <center><h6 style="font-family:sans-serif">Already Registered ?Go Back To <a href="newjsp.jsp">Login </a>Page</h6></center>
        <center><input type="submit" style="background-color: #4CAF50;
         color: white;
         padding: 16px 20px;
         border: none;
         cursor: pointer;
         width: 100%;
         opacity: 0.9;" 
          value="REGISTER" name="register" /></center>
    </form>   
    </body>
</html>
