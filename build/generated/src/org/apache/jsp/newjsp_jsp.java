package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
import java.io.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("      <style>\n");
      out.write("body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-img {\n");
      out.write("  /* The image used */\n");
      out.write("  background-image: url(\"paint-bright-blurred-yellow-wallpaper.jpg\");\n");
      out.write("\n");
      out.write("  min-height: 500px;\n");
      out.write("\n");
      out.write("  /* Center and scale the image nicely */\n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add styles to the form container */\n");
      out.write(".container {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 0;\n");
      out.write("  margin: 20px;\n");
      out.write("  max-width: 300px;\n");
      out.write("  padding: 16px;\n");
      out.write("  background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 15px;\n");
      out.write("  margin: 5px 0 22px 0;\n");
      out.write("  border: none;\n");
      out.write("  background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for the submit button */\n");
      out.write(".btn {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px 20px;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("  opacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  opacity: 1;\n");
      out.write("}\n");
      out.write("</style>  \n");
      out.write("</head>\n");
      out.write("<body>   \n");
      out.write("<div class=\"bg-img\">\n");
      out.write("  <form class=\"container\" action=\"login1.jsp\">\n");
      out.write("    <h1>Login</h1>\n");
      out.write("\n");
      out.write("    <label for=\"uname\"><b>Username</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n");
      out.write("\n");
      out.write("    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("    <button type=\"submit\" class=\"btn\" name=\"login\" value=\"Y\">Login</button>\n");
      out.write("    <h6>Don't have an account yet ?<br>\n");
      out.write("    <a href='registrationform.jsp'>CLICK HERE</a> to create a new account</h6>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
