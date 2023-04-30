package org.apache.jsp.pictures.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class deletecart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

     try{
         HttpSession login=request.getSession(false); 
         String userid1=(String)login.getAttribute("usid");
         int userid=Integer.parseInt(userid1);
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from deleteval"); 
         while(rs.next()){
         int a=rs.getInt("delid");
         Statement stt=con.createStatement();
         //practise 
         stt.execute("delete from practise where pid='"+a+"' ");
         out.println("deleted");
          ResultSet rs2=st.executeQuery("select * from artgallery.practise where usid='"+userid+"'"); 
          
      out.write("<table border=\"1\" align=\"center\" style=\"border-collapse:collapse\">\n");
      out.write("         <thead>\n");
      out.write("             <tr style=\"background-color:black;color: white\">\n");
      out.write("                 <th>Product ID</th>\n");
      out.write("                 <th>Product Name</th>\n");
      out.write("                 <th>Quantity</th>\n");
      out.write("                 <th>Price</th>\n");
      out.write("                 <th style=\"max-height:500% ;max-width: 500%\">Image</th>\n");
      out.write("                 <th>Discard</th>\n");
      out.write("             </tr>\n");
      out.write("         </thead>\n");
      out.write("         <tbody>\n");
      out.write("         ");

         while(rs2.next()){
          
      out.write("  \n");
      out.write("          ");
 int productid=rs2.getInt("pid");
                HttpSession prod=request.getSession();
               prod.setAttribute("pdid",productid);
               out.println(productid+"------");
                out.println(productid+"------");
             
      out.write("\n");
      out.write("         <tr>\n");
      out.write("             \n");
      out.write("             <td>");
      out.print(rs2.getInt("pid"));
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs2.getString("pname"));
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs2.getInt("pquant"));
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs2.getInt("pprice"));
      out.write("</td>\n");
      out.write("             <td style=\"width:160px;height:200px\"><img src=\"../images/");
      out.print(rs2.getString("pimage"));
      out.write("\" style=\"max-height:100% ;max-width:100%\"></td>\n");
      out.write("             ");

              int a1=rs2.getInt("pid");
              Statement si=con.createStatement();
              si.executeUpdate("insert into deleteval(`delid`) values ('"+a1+"')"); 
      out.write("\n");
      out.write("             <td><a href=\"../cart/deletecart.jsp\"> Delete</a></td>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("         </tr>\n");
      out.write("         ");

         }
      out.write("\n");
      out.write("         </tbody>\n");
      out.write("         </table>");

         }
         
      out.write("alert(\"deleted succesfully\");");

}
     catch(Exception e){
          System.out.println(e.toString());
          }
        
        
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
