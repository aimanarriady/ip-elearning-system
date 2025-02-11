package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stud_005fviewcourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/Dashboard2.css\" />\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\"> \n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            /* UTILITIES */\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* NAVBAR STYLING STARTS */\n");
      out.write("            .navbar {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: teal;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .nav-links a {\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            /* LOGO */\n");
      out.write("            .logo {\n");
      out.write("                font-size: 32px;\n");
      out.write("            }\n");
      out.write("            /* NAVBAR MENU */\n");
      out.write("            .menu {\n");
      out.write("                display: flex;\n");
      out.write("                gap: 1em;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .menu li:hover {\n");
      out.write("                background-color: #4c9e9e;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                transition: 0.3s ease;\n");
      out.write("            }\n");
      out.write("            .menu li {\n");
      out.write("                padding: 5px 14px;\n");
      out.write("            }\n");
      out.write("            /* DROPDOWN MENU */\n");
      out.write("            .services {\n");
      out.write("                position: relative; \n");
      out.write("            }\n");
      out.write("            .dropdown {\n");
      out.write("                background-color: rgb(1, 139, 139);\n");
      out.write("                padding: 1em 0;\n");
      out.write("                position: absolute; /*WITH RESPECT TO PARENT*/\n");
      out.write("                display: none;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                top: 35px;\n");
      out.write("            }\n");
      out.write("            .dropdown li + li {\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .dropdown li {\n");
      out.write("                padding: 0.5em 1em;\n");
      out.write("                width: 8em;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .dropdown li:hover {\n");
      out.write("                background-color: #4c9e9e;\n");
      out.write("            }\n");
      out.write("            .services:hover .dropdown {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*sidebar*/\n");
      out.write("            .sidebar {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                width: 200px;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                position: fixed;\n");
      out.write("                height: 100%;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a {\n");
      out.write("                display: block;\n");
      out.write("                color: black;\n");
      out.write("                padding: 40px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a.active {\n");
      out.write("                background-color: #04AA6D;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a:hover:not(.active) {\n");
      out.write("                background-color: #555;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.content {\n");
      out.write("                margin-left: 200px;\n");
      out.write("                padding: 1px 16px;\n");
      out.write("                height: 1000px;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.content1{\n");
      out.write("                padding: 40px;\n");
      out.write("                border-style: solid;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                width: 250px;\n");
      out.write("                height: 250px;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 700px) {\n");
      out.write("                .sidebar {\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: auto;\n");
      out.write("                    position: relative;\n");
      out.write("                }\n");
      out.write("                .sidebar a {float: left;}\n");
      out.write("                div.content {margin-left: 0;}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 400px) {\n");
      out.write("                .sidebar a {\n");
      out.write("                    text-align: center;\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <!-- LOGO -->\n");
      out.write("            <div class=\"logo\">E-learning</div>\n");
      out.write("            <!-- NAVIGATION MENU -->\n");
      out.write("            <ul class=\"nav-links\">\n");
      out.write("                <!-- NAVIGATION MENUS -->\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <!--           <li><a href=\"/\">Contacts</a></li>-->\n");
      out.write("                    <li><a>");
      out.print( session.getAttribute("student_login"));
      out.write("</a></li>\n");
      out.write("                    <li class=\"services\">\n");
      out.write("                        <a href=\"/\">Profile</a>\n");
      out.write("                        <!-- DROPDOWN MENU -->\n");
      out.write("                        <ul class=\"dropdown\">\n");
      out.write("                            <li><a href=\"/\">My Profile </a></li>\n");
      out.write("                            <li><a href=\"/\">Settings</a></li>  \n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"/\">Contacts</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <a class=\"active\" href=\"#home\">Courses</a>\n");
      out.write("            <a href=\"#news\">Assignment</a>\n");
      out.write("            <a href=\"#contact\">Student List</a>\n");
      out.write("            <a href=\"registerSub.jsp\">Manage Grade</a>\n");
      out.write("            <a href=\"#about\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"content1\">\n");
      out.write("                <div class=\"text\">\n");
      out.write("                    <h2>2021/2022 - SEMESTER 1</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"register\">\n");
      out.write("                <h1>Course Overview </h1>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <table class=\"tableCo\" style=\"width:100%\">\n");
      out.write("                   \n");
      out.write("   </body>\n");
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
