package org.apache.jsp.pictures.customizedart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customizedart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        .header {\n");
      out.write("                 background-image:url(p.jfif);\n");
      out.write("                 padding: 20px;\n");
      out.write("                 text-align: center;\n");
      out.write("                 color:white;\n");
      out.write("                  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;\n");
      out.write("                }\n");
      out.write("         .topnav {\n");
      out.write("                 overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("                 }\n");
      out.write("\n");
      out.write("/* Style the topnav links */\n");
      out.write("          .topnav a {\n");
      out.write("                 float: left;\n");
      out.write("                display: block;\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("/* Change color on hover */\n");
      out.write("            .topnav a:hover {\n");
      out.write("                 background-color: #ddd;\n");
      out.write("                 color: black;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                .column {\n");
      out.write("        float: left;\n");
      out.write("       padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Left and right column */\n");
      out.write(".column.side {\n");
      out.write("  width: 10%;\n");
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
      out.write("                    /* Style the footer */\n");
      out.write("            .footer {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("      <h1>CUSTOMIZED ART</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"topnav\">\n");
      out.write("      <a href=\"../../newjsp.jsp\">Logout</a>\n");
      out.write("  <a href=\"../../homepage.jsp\"><<< Back</a>\n");
      out.write("    </div> \n");
      out.write("  <div class=\"row\">\n");
      out.write("  <div class=\"column side\" style=\"background-color:black;\">\n");
      out.write("    <h2>Side</h2>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div style=\"background-color:black;\"class=\"column middle\">\n");
      out.write("   <h2>Select Artwork</h2>\n");
      out.write("    <a class=\"popup\" href=\"arts/joker.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"jjj.jpg\" alt=\"\" /><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"arts/suprisedgirl.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"kkk.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"arts/moderngirl.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"eee.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"arts/popgirl.jsp\" class=\"previous\"><img style=\"height:300px;width: 250px\" src=\"aaa.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("    <a class=\"popup\" href=\"arts/poplips.jsp\" class=\"previous\"> <img style=\"height:300px;width: 250px\" src=\"bbb.jpg\" alt=\"\"/><br>PRICE - 1000 RS</a>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div style=\"background-color:grey;\"class=\"column side\">\n");
      out.write("    <h2>Side</h2>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"footer\">\n");
      out.write("  <p>Footer</p>\n");
      out.write("    </div>\n");
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
