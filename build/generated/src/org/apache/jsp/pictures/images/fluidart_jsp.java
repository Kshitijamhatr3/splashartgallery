package org.apache.jsp.pictures.images;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fluidart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     <style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the header */\n");
      out.write(".header {\n");
      out.write("  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;\n");
      out.write("  color: orange;\n");
      out.write("  background:url(sketch1.jpg);\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the top navigation bar */\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the topnav links */\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change color on hover */\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create three unequal columns that floats next to each other */\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Left and right column */\n");
      out.write(".column.side {\n");
      out.write("  width: 15%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Middle column */\n");
      out.write(".column.middle {\n");
      out.write("  width: 70%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .column.side, .column.middle {\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the footer */\n");
      out.write(".footer {\n");
      out.write("  background-color:black;\n");
      out.write("  padding: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top: 800px;\n");
      out.write("}\n");
      out.write("/* image pop up*/\n");
      out.write("a.popup {\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.popup:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".previous {\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  -webkit-transition-duration: 0.4s; /* Safari */\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1 {\n");
      out.write("  background-color: white; \n");
      out.write("  color: black; \n");
      out.write("  border: 2px solid orange;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1:hover {\n");
      out.write("  background-color: orange;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"header\">\n");
      out.write("  <h1>SKETCHES </h1>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"topnav\">\n");
      out.write("  <a href=\"newjsp.jsp\">Login</a>\n");
      out.write("  <a href=\"registrationform.jsp\">SignUp</a>\n");
      out.write("  <a href=\"homepage.jsp\"> <<< Home</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"column side\">\n");
      out.write("    <h2>Categories</h2>\n");
      out.write("    <select name=\"select by name\">\n");
      out.write("        <option></option>\n");
      out.write("        <option>Doodle</option>\n");
      out.write("        <option>Scribble</option>\n");
      out.write("        <option>Pointalism</option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("    </select>\n");
      out.write("    <h2>Sort by</h2>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"column middle\">\n");
      out.write("    <h2>Select Sketches</h2>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch1.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"pictures/images/s1.jpg\" alt=\"\" /><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch2.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"pictures/images/s2.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch3.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"pictures/images/s3.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch4.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"pictures/images/s4.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch5.jsp\" class=\"previous\"> <img style=\"height:300px;width: 250px\" src=\"pictures/images/s5.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch6.jsp\" class=\"previous\"> <img style=\"height:300px;width: 250px\" src=\"pictures/images/s6.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch1.jsp\" class=\"previous\"> <img style=\"height:300px;width: 250px\" src=\"pictures/images/s7.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch1.jsp\" class=\"previous\"> <img style=\"height:300px;width: 250px\" src=\"pictures/images/s8.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch1.jsp\" class=\"previous\"> <img style=\"height:300px;width: 250px\" src=\"pictures/images/s9.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"pictures/sketchesjsp/sketch1.jsp\" class=\"previous\"> <img style=\"height:300px;width: 250px\" src=\"pictures/images/s10.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <form>\n");
      out.write("  <div class=\"column side\">\n");
      out.write("    <h2>Subscribe</h2>\n");
      out.write("    <h5 style=\"font-family:sans-serif\">Your Email<br><input type=\"text\" name=\"subscribe\"></h5>\n");
      out.write("    <button type=\"submit\"  class=\"button button1 \" name=\"send\" value=\"send\">Send</button>\n");
      out.write("    <p></p>\n");
      out.write("  </div>\n");
      out.write("  </form>    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("  <p>Footer</p>\n");
      out.write("</div>\n");
      out.write("\n");
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
