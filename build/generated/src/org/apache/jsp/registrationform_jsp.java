package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.*;
import java.io.*;
import javax.servlet.http.HttpServlet;

public final class registrationform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> REGISTRATION FORM</title>\n");
      out.write("     <style> \n");
      out.write("div {\n");
      out.write("  width: 800px;\n");
      out.write("  height: 25px;\n");
      out.write("  border-radius: 25px;\n");
      out.write("  background-color: red;\n");
      out.write("  position: relative;\n");
      out.write("  -webkit-animation-name: example; /* Safari 4.0 - 8.0 */\n");
      out.write("  -webkit-animation-duration: 10s; /* Safari 4.0 - 8.0 */\n");
      out.write("  -webkit-animation-iteration-count: 100; /* Safari 4.0 - 8.0 */\n");
      out.write("  animation-name: example;\n");
      out.write("  animation-duration: 10s;\n");
      out.write("  animation-iteration-count: 100;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    position: absolute;\n");
      out.write("  right: 0;\n");
      out.write("  margin: 20px;\n");
      out.write("  max-width: 400px;\n");
      out.write("  padding: 16px;\n");
      out.write("  background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Safari 4.0 - 8.0 */\n");
      out.write("@-webkit-keyframes example {\n");
      out.write("  0%   {background-color:red; left:0px; top:0px;}\n");
      out.write("  25%  {background-color:yellow; left:200px; top:0px;}\n");
      out.write("  100% {background-color:pink; left:0px; top:0px;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Standard syntax */\n");
      out.write("@keyframes example {\n");
      out.write("  0%   {background-color:red; left:0px; top:0px;}\n");
      out.write("  25%  {background-color:yellow; left:300px; top:0px;}\n");
      out.write("  100% {background-color:yellowgreen; left:0px; top:0px;}\n");
      out.write("}\n");
      out.write("</style>  \n");
      out.write("<script> \n");
      out.write("function regex()\t\t\t\t\t\t\t\t \n");
      out.write("{ \t\n");
      out.write("var fname = document.forms[\"RegForm\"][\"fname\"];\n");
      out.write("var lname = document.forms[\"RegForm\"][\"lname\"];\n");
      out.write("var email = document.forms[\"RegForm\"][\"email\"];\n");
      out.write("var phn = document.forms[\"RegForm\"][\"phonenumber\"];\n");
      out.write("var uname = document.forms[\"RegForm\"][\"uname\"];\n");
      out.write("var pass = document.forms[\"RegForm\"][\"pass\"];\n");
      out.write("var cpass = document.forms[\"RegForm\"][\"cpass\"];\n");
      out.write("var regex = /^[a-zA-Z ]{2,30}$/;\n");
      out.write("var emailregex= /^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$/;\n");
      out.write("var phnregex=/^[2-9]{2}[0-9]{8}$/;\n");
      out.write("var unameregex=/^[a-z0-9_-]{3,15}$/;\n");
      out.write("var passregex=/^(?=.*\\d).{4,8}$/;\n");
      out.write("if (fname.value == \"\" || lname.value==\"\" || email.value==\"\" || phn.value==\"\" || uname.value==\"\" || pass.value==\"\" || cpass.value==\"\")\t\t\t\t\t\t\t \n");
      out.write("\t{ \n");
      out.write("\t\twindow.alert(\"Fields cannot be empty\"); \n");
      out.write("\t\tfname.focus(); \n");
      out.write("                uname.focus(); \n");
      out.write("                lname.focus(); \n");
      out.write("                email.focus(); \n");
      out.write("                phn.focus(); \n");
      out.write("                pass.focus(); \n");
      out.write("                cpass.focus(); \n");
      out.write("\t\treturn false; \n");
      out.write("\t} \n");
      out.write("  else if (!regex.test(fname.value)) {\n");
      out.write("      window.alert(\"Invalid Input for First Name\"); \n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("  else if (!regex.test(lname.value)) {\n");
      out.write("      window.alert(\"Invalid Input for Last Name\"); \n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("  else if (!emailregex.test(email.value)) {\n");
      out.write("      window.alert(\"Invalid Input for Email\"); \n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("  else if (!phnregex.test(phn.value)) {\n");
      out.write("      window.alert(\"Invalid Input for Phone number\"); \n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("  else if (!unameregex.test(uname.value)) {\n");
      out.write("      window.alert(\"Invalid Input for Username\"); \n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("  else if (pass.value!=cpass.value) {\n");
      out.write("      window.alert(\"Password didn't matched\"); \n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    //The password's first character must be a letter, it must contain at least 4 characters and no more than 15 characters and no characters other than letters, numbers and the underscore may be used\n");
      out.write("  else if (!passregex.test(pass.value)) {\n");
      out.write("      window.alert(\"Password must be between 4 and 8 digits long and include at least one numeric digit.\"); \n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("  else if (!passregex.test(cpass.value)) {\n");
      out.write("      window.alert(\"Password expression. Password must be between 4 and 8 digits long and include at least one numeric digit.\"); \n");
      out.write("      return false;\n");
      out.write("    } \n");
      out.write("  else{\n");
      out.write("  return true;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"paint-bright-blurred-yellow-wallpaper.jpg\">\n");
      out.write("    <form name=\"RegForm\" action=\"register1.jsp\" method=\"POST\" class=\"container\" onsubmit=\"return regex()\">\n");
      out.write("        <b><h1 style=\"font-family:Cambria ; color:black ;\">SIGN UP </h1></b>    \n");
      out.write("        <center>\n");
      out.write("        <div></div>    \n");
      out.write("            <table cellspacing=\"10\" img=\"LP2Ov5.jpg\">\n");
      out.write("            <tbody>              \n");
      out.write("                <tr>\n");
      out.write("                    <td><b>FIRST NAME</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"First Name\" name=\"fname\" style=\" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>LAST NAME</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>   \n");
      out.write("                    <td><input type=\"text\" placeholder=\"Last Name\" name=\"lname\" style=\" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>EMAIL</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Email\" name=\"email\" style=\" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>PHONE NUMBER</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"Phone Number\" name=\"phonenumber\" style=\" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>USER NAME</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" placeholder=\"User Name\" name=\"uname\" style=\" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>PASSWORD</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"password\" placeholder=\"Password\" name=\"pass\" value=\"\" style=\" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>CONFIRM PASSWORD</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"password\" placeholder=\"Confirm Password\" name=\"cpass\" value=\"\" style=\" width: 100%;  padding: 15px;margin: 5px 0 22px 0;border: none;background: #f1f1f1;\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            <div></div>\n");
      out.write("        </center>\n");
      out.write("        <br>\n");
      out.write("        <center><h6 style=\"font-family:sans-serif\">Already Registered ?Go Back To <a href=\"newjsp.jsp\">Login </a>Page</h6></center>\n");
      out.write("        <center><input type=\"submit\" style=\"background-color: #4CAF50;\n");
      out.write("         color: white;\n");
      out.write("         padding: 16px 20px;\n");
      out.write("         border: none;\n");
      out.write("         cursor: pointer;\n");
      out.write("         width: 100%;\n");
      out.write("         opacity: 0.9;\" \n");
      out.write("          value=\"REGISTER\" name=\"register\" /></center>\n");
      out.write("    </form>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
