package org.apache.jsp.pictures.payment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the header */\n");
      out.write(".header {\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: black;\n");
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
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 33.33%;\n");
      out.write("  padding: 15px;\n");
      out.write("}\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("@media screen and (max-width:600px) {\n");
      out.write("  .column {\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url(pp1.jpg) \">\n");
      out.write("        \n");
      out.write("        <form action=\"confirmation.jsp\">\n");
      out.write("            <div class=\"header\" style=\"background-image:url(dd.jpg)\">\n");
      out.write("            <h1 style=\"color:white\">PAYMENT</h1>\n");
      out.write("            <a href=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"topnav\">\n");
      out.write("            <a href=\"../../newjsp.jsp\">Logout</a>\n");
      out.write("            <a href=\"../cart/deletecart1.jsp\"><<< Back</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"column\">\n");
      out.write("            \n");
      out.write("        ");

         int total=0;
         HttpSession login=request.getSession(false); 
         String userid1=(String)login.getAttribute("usid");
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from practise where usid='"+userid1+"'"); 
      out.write("\n");
      out.write("          <table border=\"1\" align=\"left\" style=\"border-collapse:collapse\"> \n");
      out.write("              <thead>\n");
      out.write("             <tr style=\"background-color:black;color: white\">\n");
      out.write("                 \n");
      out.write("                 <th>Product Name</th>\n");
      out.write("                 <th>Price</th>\n");
      out.write("                 <th style=\"max-height:500% ;max-width: 500%\">Image</th>\n");
      out.write("             </tr>\n");
      out.write("         </thead>\n");
      out.write("              \n");
      out.write("              <tbody>");

         while(rs.next()){
           total+=rs.getInt("pprice");  
      out.write("\n");
      out.write("          \n");
      out.write("           <tr>\n");
      out.write("             <td style=\"color:white;font-size:18px;text-align:center;\" >");
      out.print(rs.getString("pname"));
      out.write("</td>\n");
      out.write("             <td style=\"color:white\">");
      out.print(rs.getInt("pprice"));
      out.write("</td>\n");
      out.write("             <td style=\"width:160px;height:200px\"><img src=\"../images/");
      out.print(rs.getString("pimage"));
      out.write("\" style=\"max-height:100% ;max-width:100%\"></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("         ");
 }  
      out.write("\n");
      out.write("          </tbody>\n");
      out.write("          </table>\n");
      out.write("           </div>\n");
      out.write("          <div class=\"column\"><p style=\"color:white;font-size:20px;\">\n");
      out.write("                  \n");
      out.write("         ");

         out.println("Subtotal :"+total);         
         
      out.write("   </p>     \n");
      out.write("         <h3 style=\"color:white;\">Your Address :</h3>\n");
      out.write("         <textarea id=\"hellokai\" name=\"hellokai\"></textarea>\n");
      out.write("         <hr>\n");
      out.write("         <h3 style=\"color:white;\">\n");
      out.write("         STANDARD SHIPPING : RS 130<br>\n");
      out.write("         <b>PAYMENT METHOD</b>\n");
      out.write("            (Cash on delivery )\n");
      out.write("            Charges - 85\n");
      out.write("         <hr>\n");
      out.write("         Details\n");
      out.write("         <br>Retail price total : <strike>");
      out.print(total+4955);
      out.write("</strike>\n");
      out.write("         <br>Subtotal :");
      out.print(total);
      out.write("\n");
      out.write("         <br>Shipping price : 130\n");
      out.write("         <br>COD : 85\n");
      out.write("         <HR></h3>\n");
      out.write("         <h2 style=\"color:white;\"><b>TOTAL :");
      out.print(total+130+85);
      out.write("</b></h2>\n");
      out.write("         ");

          
          HttpSession total1=request.getSession();
          total1.setAttribute("totalid",total);
         
      out.write("\n");
      out.write("         \n");
      out.write("         <div align=\"center\">\n");
      out.write("             <button style=\"background-color:green;width:200px;height:50px;border-radius:12px;opacity:0.9;box-shadow:  0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19) ;align-content:center ;color:black;\" value=\"CONTINUE PURCHASE\" onclick=\"window.location.href='../../homepage.jsp';\">CONFIRM</button>\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("      \n");
      out.write("         \n");
      out.write("           </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         </form>\n");
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
