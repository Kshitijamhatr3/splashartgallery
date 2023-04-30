package org.apache.jsp.pictures.sketchesjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sketch9_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  background:url(../../sketch1.jpg);\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-shadow: 1px 1px 2px black, 0 0 25px BLACK, 0 0 5px black;\n");
      out.write("  position: sticky;\n");
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
      out.write("  width: 70%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Middle column */\n");
      out.write(".column.middle {\n");
      out.write("  width: 30%;\n");
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
      out.write("/*add to cart button*/\n");
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
      out.write("/*IMAGE ZOOM IN EFFECT*/\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write(".img-zoom-container {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img-zoom-lens {\n");
      out.write("  position: absolute;\n");
      out.write("  border: 1px solid #d4d4d4;\n");
      out.write("  /*set the size of the lens:*/\n");
      out.write("  width: 40px;\n");
      out.write("  height: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img-zoom-result {\n");
      out.write("  border: 1px solid #d4d4d4;\n");
      out.write("  /*set the size of the result div:*/\n");
      out.write("  width: 400px;\n");
      out.write("  height: 380px;\n");
      out.write("}\n");
      out.write("/* Style the footer */\n");
      out.write(".footer {\n");
      out.write("  background-color:black;\n");
      out.write("  padding: 10px;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top: 1000px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("function imageZoom(imgID, resultID) {\n");
      out.write("  var img, lens, result, cx, cy;\n");
      out.write("  img = document.getElementById(imgID);\n");
      out.write("  result = document.getElementById(resultID);\n");
      out.write("  /*create lens:*/\n");
      out.write("  lens = document.createElement(\"DIV\");\n");
      out.write("  lens.setAttribute(\"class\", \"img-zoom-lens\");\n");
      out.write("  /*insert lens:*/\n");
      out.write("  img.parentElement.insertBefore(lens, img);\n");
      out.write("  /*calculate the ratio between result DIV and lens:*/\n");
      out.write("  cx = result.offsetWidth / lens.offsetWidth;\n");
      out.write("  cy = result.offsetHeight / lens.offsetHeight;\n");
      out.write("  /*set background properties for the result DIV:*/\n");
      out.write("  result.style.backgroundImage = \"url('\" + img.src + \"')\";\n");
      out.write("  result.style.backgroundSize = (img.width * cx) + \"px \" + (img.height * cy) + \"px\";\n");
      out.write("  /*execute a function when someone moves the cursor over the image, or the lens:*/\n");
      out.write("  lens.addEventListener(\"mousemove\", moveLens);\n");
      out.write("  img.addEventListener(\"mousemove\", moveLens);\n");
      out.write("  /*and also for touch screens:*/\n");
      out.write("  lens.addEventListener(\"touchmove\", moveLens);\n");
      out.write("  img.addEventListener(\"touchmove\", moveLens);\n");
      out.write("  function moveLens(e) {\n");
      out.write("    var pos, x, y;\n");
      out.write("    /*prevent any other actions that may occur when moving over the image:*/\n");
      out.write("    e.preventDefault();\n");
      out.write("    /*get the cursor's x and y positions:*/\n");
      out.write("    pos = getCursorPos(e);\n");
      out.write("    /*calculate the position of the lens:*/\n");
      out.write("    x = pos.x - (lens.offsetWidth / 2);\n");
      out.write("    y = pos.y - (lens.offsetHeight / 2);\n");
      out.write("    /*prevent the lens from being positioned outside the image:*/\n");
      out.write("    if (x > img.width - lens.offsetWidth) {x = img.width - lens.offsetWidth;}\n");
      out.write("    if (x < 0) {x = 0;}\n");
      out.write("    if (y > img.height - lens.offsetHeight) {y = img.height - lens.offsetHeight;}\n");
      out.write("    if (y < 0) {y = 0;}\n");
      out.write("    /*set the position of the lens:*/\n");
      out.write("    lens.style.left = x + \"px\";\n");
      out.write("    lens.style.top = y + \"px\";\n");
      out.write("    /*display what the lens \"sees\":*/\n");
      out.write("    result.style.backgroundPosition = \"-\" + (x * cx) + \"px -\" + (y * cy) + \"px\";\n");
      out.write("  }\n");
      out.write("  function getCursorPos(e) {\n");
      out.write("    var a, x = 0, y = 0;\n");
      out.write("    e = e || window.event;\n");
      out.write("    /*get the x and y positions of the image:*/\n");
      out.write("    a = img.getBoundingClientRect();\n");
      out.write("    /*calculate the cursor's x and y coordinates, relative to the image:*/\n");
      out.write("    x = e.pageX - a.left;\n");
      out.write("    y = e.pageY - a.top;\n");
      out.write("    /*consider any page scrolling:*/\n");
      out.write("    x = x - window.pageXOffset;\n");
      out.write("    y = y - window.pageYOffset;\n");
      out.write("    return {x : x, y : y};\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("  <h1>Sketches</h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"topnav\">\n");
      out.write("  <a href=\"../../newjsp.jsp\">Login</a>\n");
      out.write("  <a href=\"../../registrationform.jsp\">Sign Up</a>\n");
      out.write("  <a href=\"../../sketches.jsp\"><<< Back</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"column middle\">\n");
      out.write("    <h2>Margo Sketch</h2>\n");
      out.write("    <div class=\"img-zoom-container\">\n");
      out.write("    <img id=\"myimage\" style=\"width:400px;height: 500px\" src=\"../images/s9.jpg\" alt=\"\"/>\n");
      out.write("    <div id=\"myresult\" class=\"img-zoom-result\"></div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("     // Initiate zoom effect:\n");
      out.write("     imageZoom(\"myimage\", \"myresult\");\n");
      out.write("    </script>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"column side\">\n");
      out.write("    <table>\n");
      out.write("    <tr>\n");
      out.write("    <td>\n");
      out.write("    <h1>Description</h1>\n");
      out.write("    <br><br><br>\n");
      out.write("    <h3>Category - Sketch\n");
      out.write("    <br>Artist - Mary Lury\n");
      out.write("    <br>Frames - Availabe\n");
      out.write("    <br>Size - 20.00 X 13.00 Inch \n");
      out.write("    <br>Year - 2019\n");
      out.write("    </h3>\n");
      out.write("    <h2>Price - 1000 ISD </h2><br><br><br><br>\n");
      out.write("    <button class=\"button button1\"><b>+</b>  ADD TO CART </button>\n");
      out.write("    <button class=\"button button1\"> BUY NOW </button>\n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("  <p>Footer</p>\n");
      out.write("</div>\n");
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
