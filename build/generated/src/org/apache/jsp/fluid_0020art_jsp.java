package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fluid_0020art_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>fluid art</title>\n");
      out.write("        <style>\n");
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
      out.write("  color: white;\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("  background: url(fluidart.jpg);\n");
      out.write("  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;\n");
      out.write("  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;\n");
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
      out.write("  width: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Middle column */\n");
      out.write(".column.middle {\n");
      out.write("  width: 50%;\n");
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
      out.write("  background-color: #f1f1f1;\n");
      out.write("  padding: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top: 800px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"header\">\n");
      out.write("           <h1>FLUID ART</h1>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"topnav\">\n");
      out.write("  <a href=\"newjsp.jsp\">Login</a>\n");
      out.write("  <a href=\"registrationform.jsp\">Sign Up</a>\n");
      out.write("  <a href=\"homepage.jsp\"><<< Home</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"column side\">\n");
      out.write("    <h2>Side</h2>\n");
      out.write("    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit..</p>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"column middle\">\n");
      out.write("    <h2>Main Content</h2>\n");
      out.write("    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>\n");
      out.write("    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"column side\">\n");
      out.write("    <h2>Side</h2>\n");
      out.write("    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit..</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("  <p>Footer</p>\n");
      out.write("</div> \n");
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
