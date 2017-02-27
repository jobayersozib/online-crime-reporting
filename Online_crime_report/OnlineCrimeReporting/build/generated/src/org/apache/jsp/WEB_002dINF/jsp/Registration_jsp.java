package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"register_section\">\n");
      out.write("            <h1>Registration</h1>\n");
      out.write("            \n");
      out.write("            <form action=\"registration.htm?name=null\" method=\"post\" id=\"place_registration\">\n");
      out.write("                <p><label for=\"name\">Name :</label>\n");
      out.write("                    <input type=\"text\" name=\"name_box\" value=\"\" id=\"name\"/></p>\n");
      out.write("                <p><label for=\"username\">Username :</label>\n");
      out.write("                    <input type=\"text\" name=\"username_box\" value=\"\" id=\"username\"/></p>\n");
      out.write("                <p><label for=\"email\">E-mail :</label>\n");
      out.write("                    <input type=\"text\" name=\"email_box\" value=\"\" id=\"email\"/></p>\n");
      out.write("                <p><label for=\"password\">Password :</label>\n");
      out.write("                    <input type=\"password\" name=\"password_box\" value=\"\" id=\"password\"/></p>\n");
      out.write("                <p><label for=\"repassword\">Re-Type Password :</label>\n");
      out.write("                    <input type=\"password\" name=\"repassword_box\" value=\"\" id=\"repassword\"/></p>\n");
      out.write("                 <p><label for=\"mobile\">Mobile no. :</label>\n");
      out.write("                    <input type=\"text\" name=\"mobile_box\" value=\"\" id=\"mobile\"/></p>\n");
      out.write("                  <p><label for=\"address\">Address :</label>\n");
      out.write("                    <input type=\"text\" name=\"address_box\" value=\"\" id=\"address\"/></p>\n");
      out.write("               \n");
      out.write("                <input type=\"submit\" id=\"submit\" value=\"Register\"/>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
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
