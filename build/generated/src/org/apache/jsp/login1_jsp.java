package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

       String username=request.getParameter("uname");
       String password=request.getParameter("psw");
       try{
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","hazzaforever");
         Statement st=con.createStatement();
         //for checking credentials for login
         ResultSet rs=st.executeQuery("select * from registration where uname='"+username+"' and pass='"+password+"'"); 
         //for checking existence of database
         //practiceeee
         //DatabaseMetaData dbm=con.getMetaData();
         //ResultSet tables=dbm.getTables(null,null,"practice",null);
         //practiceeeee
          //practiceee         
        // if(tables.next()){ //if table exist
            //dont do anythin   
         //}
         //else{
             
         //}
         
         //practice
         if(rs.next()){
           String  Username=rs.getString("uname");
           String  Password=rs.getString("pass");
           String name1=rs.getString("fname");
           String name2=rs.getString("lname");
           String userid=rs.getString("srno"); 
           String email=rs.getString("email");
           if(username.equals(Username)&&password.equals(Password)){
               HttpSession uid=request.getSession();
               uid.setAttribute("usid",userid);
               HttpSession s=request.getSession();
               s.setAttribute("fn", name1);
               HttpSession s1=request.getSession();
               s1.setAttribute("ln", name2);
               response.sendRedirect("homepage.jsp");
               HttpSession mail=request.getSession();
               mail.setAttribute("email",email);
           }
         }
         else{
           
      out.write("\n");
      out.write("           ");
      if (true) {
        _jspx_page_context.forward("newjsp.jsp");
        return;
      }
      out.write("\n");
      out.write("           ");
  
           
         }
       }
       catch(Exception e){
         out.println(e);   
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
