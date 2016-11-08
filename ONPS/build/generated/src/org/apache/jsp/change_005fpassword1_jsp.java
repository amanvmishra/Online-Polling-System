package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class change_005fpassword1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"res/Site.css\"/>\n");
      out.write("<title>\n");
      out.write("    Online Pooling : Admin HomePage\n");
      out.write("</title>\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    <header id=\"top\">\n");
      out.write("        <h1 id =\"heading\">ONLINE NATIONAL POLING SYSTEM<br>\n");
      out.write("        </h1>\n");
      out.write("        <nav id=\"mainnav\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"voter_homepage.jsp\" >Home</a></li>\n");
      out.write("                <li><a href=\"userlist.jsp\">List User</a></li>\n");
      out.write("                   <li><a href=\"vote.jsp\">Result</a></li>\n");
      out.write("                <li><a href=\"change_password.jsp\">Change Password</a></li>\n");
      out.write("                <li><a href=\"change_password.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<center>\n");
      out.write("    <pre>\n");
      out.write("     <img src=\"res/login.png\" width=\"50\" height=\"50\"/> <font size=\"5\">LOGIN HERE</font>\n");
      out.write("<form action=\"changepass\" method=\"POST\">\n");
      out.write("    New Password : <input type=\"text\" name=\"npass\"/>\n");
      out.write("   \n");
      out.write("    Confirm Password : <input type=\"password\" name=\"cpass\"/>\n");
      out.write("    <hr>\n");
      out.write("    <h4 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("    \n");
      out.write("    <input class=\"button green\" type=\"submit\" value=\"Change\"/>\n");
      out.write("</form>\n");
      out.write("    </pre>\n");
      out.write("</center>\n");
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
