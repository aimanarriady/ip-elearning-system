package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBUtility.DBConnection;
import java.sql.*;

public final class updateAssignment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
 Class.forName("com.mysql.jdbc.Driver");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write(" <head>\r\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("   \r\n");
      out.write("   <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("   <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("   <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\"> \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <style>\r\n");
      out.write("    /* UTILITIES */\r\n");
      out.write("* {\r\n");
      out.write(" margin: 0;\r\n");
      out.write(" padding: 0;\r\n");
      out.write(" box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write(" font-family: cursive;\r\n");
      out.write("}\r\n");
      out.write("a {\r\n");
      out.write(" text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("li {\r\n");
      out.write(" list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* NAVBAR STYLING STARTS */\r\n");
      out.write(".navbar {\r\n");
      out.write(" display: flex;\r\n");
      out.write(" align-items: center;\r\n");
      out.write(" justify-content: space-between;\r\n");
      out.write(" padding: 20px;\r\n");
      out.write(" background-color: teal;\r\n");
      out.write(" color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".nav-links a {\r\n");
      out.write(" color: #fff;\r\n");
      out.write("}\r\n");
      out.write("/* LOGO */\r\n");
      out.write(".logo {\r\n");
      out.write(" font-size: 32px;\r\n");
      out.write("}\r\n");
      out.write("/* NAVBAR MENU */\r\n");
      out.write(".menu {\r\n");
      out.write(" display: flex;\r\n");
      out.write(" gap: 1em;\r\n");
      out.write(" font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write(".menu li:hover {\r\n");
      out.write(" background-color: #4c9e9e;\r\n");
      out.write(" border-radius: 5px;\r\n");
      out.write(" transition: 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write(".menu li {\r\n");
      out.write(" padding: 5px 14px;\r\n");
      out.write("}\r\n");
      out.write("/* DROPDOWN MENU */\r\n");
      out.write(".services {\r\n");
      out.write(" position: relative; \r\n");
      out.write("}\r\n");
      out.write(".dropdown {\r\n");
      out.write(" background-color: rgb(1, 139, 139);\r\n");
      out.write(" padding: 1em 0;\r\n");
      out.write(" position: absolute; /*WITH RESPECT TO PARENT*/\r\n");
      out.write(" display: none;\r\n");
      out.write(" border-radius: 8px;\r\n");
      out.write(" top: 35px;\r\n");
      out.write("}\r\n");
      out.write(".dropdown li + li {\r\n");
      out.write(" margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write(".dropdown li {\r\n");
      out.write(" padding: 0.5em 1em;\r\n");
      out.write(" width: 8em;\r\n");
      out.write(" text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".dropdown li:hover {\r\n");
      out.write(" background-color: #4c9e9e;\r\n");
      out.write("}\r\n");
      out.write(".services:hover .dropdown {\r\n");
      out.write(" display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*sidebar*/\r\n");
      out.write(".sidebar {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  background-color: #f1f1f1;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  overflow: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: black;\r\n");
      out.write("  padding: 40px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(".sidebar a.active {\r\n");
      out.write("  background-color: #04AA6D;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar a:hover:not(.active) {\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.container{\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.content {\r\n");
      out.write("  margin-left: 200px;\r\n");
      out.write("  padding: 1px 16px;\r\n");
      out.write("  height: 1000px;\r\n");
      out.write("  padding: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.content1{\r\n");
      out.write("    padding: 40px;\r\n");
      out.write("    border-style: solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("  width: 250px;\r\n");
      out.write("  height: 250px;\r\n");
      out.write("  text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 700px) {\r\n");
      out.write("  .sidebar {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    position: relative;\r\n");
      out.write("  }\r\n");
      out.write("  .sidebar a {float: left;}\r\n");
      out.write("  div.content {margin-left: 0;}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 400px) {\r\n");
      out.write("  .sidebar a {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    float: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <title>Document</title>\r\n");
      out.write(" </head>\r\n");
      out.write(" \r\n");
      out.write("<body>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("   <nav class=\"navbar\">\r\n");
      out.write("     <!-- LOGO -->\r\n");
      out.write("     <div class=\"logo\">E-learning</div>\r\n");
      out.write("     <!-- NAVIGATION MENU -->\r\n");
      out.write("     <ul class=\"nav-links\">\r\n");
      out.write("       <!-- NAVIGATION MENUS -->\r\n");
      out.write("       <div class=\"menu\">\r\n");
      out.write("<!--           <li><a href=\"/\">Contacts</a></li>-->\r\n");
      out.write("            <li class=\"services\">\r\n");
      out.write("           <a href=\"/\">Profile</a>\r\n");
      out.write("           <!-- DROPDOWN MENU -->\r\n");
      out.write("           <ul class=\"dropdown\">\r\n");
      out.write("             <li><a href=\"/\">My Profile </a></li>\r\n");
      out.write("             <li><a href=\"/\">Settings</a></li>  \r\n");
      out.write("           </ul>\r\n");
      out.write("\r\n");
      out.write("         </li>\r\n");
      out.write("         <li><a href=\"/\">Contacts</a></li>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("       </div>\r\n");
      out.write("     </ul>\r\n");
      out.write("   </nav>\r\n");
      out.write("     \r\n");
      out.write(" <div class=\"sidebar\">\r\n");
      out.write("  <a class=\"active\" href=\"#home\">Courses</a>\r\n");
      out.write("  <a href=\"#news\">Assignment</a>\r\n");
      out.write("  <a href=\"#contact\">Student List</a>\r\n");
      out.write("  <a href=\"#about\">Manage Grade</a>\r\n");
      out.write("  <a href=\"#about\">Logout</a>\r\n");
      out.write("</div>\r\n");
      out.write("     \r\n");
      out.write("     <div class=\"container\">\r\n");
      out.write("         <div class=\"row justify-content-center\">\r\n");
      out.write("             <div class=\"col-md-8\">\r\n");
      out.write("                 <div class=\"card\">\r\n");
      out.write("                     <div class=\"card-header\">Add an Assignment</div>\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                         <form class=\"form-horizontal\" method=\"post\" action=\"UpdateAssignment\">\r\n");
      out.write("                             ");

                               Connection conn = null;
                               conn = DBConnection.openConnection();
                               
                               PreparedStatement pst;;
                               ResultSet rs;
                                
                               String id = request.getParameter("id");
//                               String query = "select * from courses";
//                               Statement st = con.createStatement();
//                               rs = st.executeQuery(query);
                               
//                             pst = con.prepareStatement("select * from assignment where id = ?");
                               pst = conn.prepareStatement("select a.id, a.title, a.duedate, c.courseName from assignment a JOIN courses c ON a.course = c.id where a.id = ?");
                               pst.setString(1, id);
                               rs = pst.executeQuery();
                               
                               while(rs.next())
                               {

//                                
                                   
      out.write("\r\n");
      out.write("                               \r\n");
      out.write("                              <div class=\"form-group\">\r\n");
      out.write("                                 <label for=\"course\" class=\"cols-sm-2 control-label\">Course</label>\r\n");
      out.write("                                 <div class=\"cols-sm-10\">\r\n");
      out.write("                                     <div class=\"input-group\">\r\n");
      out.write("                                         <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" name=\"course\" id=\"name\" disabled value=\"");
      out.print( rs.getString("c.courseName"));
      out.write("\">\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                 <label for=\"title\" class=\"cols-sm-2 control-label\">Title</label>\r\n");
      out.write("                                 <div class=\"cols-sm-10\">\r\n");
      out.write("                                     <div class=\"input-group\">\r\n");
      out.write("                                         <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" name=\"title\" id=\"name\" value=\"");
      out.print( rs.getString("a.title"));
      out.write("\">\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"date\" class=\"cols-sm-2 control-label\">Due Date:</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                        <input type=\"date\" id=\"date\" name=\"date\" value=\"");
      out.print( rs.getString("a.duedate"));
      out.write("\">>\r\n");
      out.write("                                         \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("                                 \r\n");
      out.write("                                   \r\n");
      out.write("                                   \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                 <input type=\"file\" id=\"myFile\" name=\"filename\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                  \r\n");
      out.write("        \r\n");
      out.write("                             <div class=\"form-group\"> \r\n");
      out.write("                                <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                             <div class=\"back\">\r\n");
      out.write("                                 <a href=\"view assignment.jsp\" style=\"text-align: left;\">Back</a>\r\n");
      out.write("                             </div>\r\n");
      out.write("                                \r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                         </form>\r\n");
      out.write("                     </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div>\r\n");
      out.write("  \r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
