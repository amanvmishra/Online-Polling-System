package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link rel=\"stylesheet\" href=\"res/Site.css\"/>\n");
      out.write("<title>\n");
      out.write("    Online Pooling : REGISTER\n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("</title>\n");
      out.write("\n");
      out.write("\n");

    String st = "";
    Random rand = new Random();
    for (int i = 1; i < 8; i++) {
        if (i % 2 == 0) {
            st += (char) ((int) ((rand.nextFloat()) * 9) + 48);
        } else {
            st += (char) ((int) ((rand.nextFloat()) * 26) + 65);
        }
    }
    String[] states = {"Andaman and Nicobar Islands", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Lakshadweep", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Pondicherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttaranchal", "Uttar Pradesh", "West Bengal"};

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    <header id=\"top\">\n");
      out.write("        <h1 id =\"heading\">Register for a Better India<br>\n");
      out.write("        </h1>\n");
      out.write("        <nav id=\"mainnav\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.html\" >Home</a></li>\n");
      out.write("                <li><a href=\"candidatelogin.jsp\">Candidate Login</a></li>\n");
      out.write("                <li><a href=\"login.jsp\">Voter Login</a></li>\n");
      out.write("                <li><a href=\"register.jsp\"class=\"thispage\">Voter Registration</a></li>\n");
      out.write("                <li><a href=\"adminlogin.jsp\">Admin Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("</div>\n");
      out.write("<br><br>\n");
      out.write("<center><h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <div>\n");
      out.write("        <img src=\"res/register.png\" alt=\"Register Icon\" style=\"float:left\"/>\n");
      out.write("        <form method=\"POST\" action=\"signup\">\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr><th colspan><span style=\"font-family: cursive\">Register Here</span><br><br></th></tr>\n");
      out.write("                <tr><td>Name : </td><td><input type=\"text\" name=\"name\" placeholder=\"name\" required/><br><br></td><br><br></tr>\n");
      out.write("                <tr><td>Password   </td><td><input type=\"password\" name=\"pass\" id=\"password\" placeholder=\"password\" oninput=\"checkSize();\" required/><br><br></td></tr>\n");
      out.write("\n");
      out.write("                <tr><td> Confirm Password   </td><td><input type=\"password\" id=\"retypepassword\" placeholder=\"retype password\" oninput=\"checkPasswords();\" required/><br><br></td></tr>\n");
      out.write("                <tr><td>Address : </td><td><textarea rows=\"3\" name=\"address\" required placeholder=\"your address\" ></textarea><br><br></td></tr>\n");
      out.write("                <tr><td>State : </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name =\"state\">\n");
      out.write("                            <option value=\"-1\">------SELECT STATE------</option>\n");
      out.write("                            ");
for (String s : states) {
      out.write("\n");
      out.write("                            <option  value=\"");
      out.print(s);
      out.write('"');
      out.write('>');
      out.print(s);
      out.write(" </option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <br><br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr><td>Gender</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"M\"> Male\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"F\"> Female\n");
      out.write("                        <br><br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr><td>Highest level of education</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"academics\" value=\"10th\"/> 10th\n");
      out.write("                        <input type=\"radio\" name=\"academics\" value=\"12th\"/> 12th\n");
      out.write("                        <input type=\"radio\" name=\"academics\" value=\"Graduate\"/>Graduate\n");
      out.write("                        <input type=\"radio\" name=\"academics\" value=\"Post_Graduate\"/>Post Graduate\n");
      out.write("                        <br><br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>UPLOAD IMAGE</td>\n");
      out.write("                    <td><input type=\"file\" name=\"profile_picture\"/><br><br></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <center>\n");
      out.write("                <input class=\"captcha\" id=\"captcha\" value=\"");
      out.print(st);
      out.write("\"/><br><br>\n");
      out.write("                <input type=\"text\" id=\"confirm_captcha\" placeholder=\"type captcha\" oninput=\"checkCaptcha();\" required /><br><br>\n");
      out.write("            </center>\n");
      out.write("            <center>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"submit\" value=\"Register\"  class=\"button green\"/>\n");
      out.write("\n");
      out.write("                    <input type=\"reset\" value=\"Reset\"  class=\"button red\"/>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function checkSize() {\n");
      out.write("                var password1 = document.getElementById('password');\n");
      out.write("                var s = password1.value;\n");
      out.write("                if (s.length < 6) {\n");
      out.write("                    password1.setCustomValidity('Invalid Password');\n");
      out.write("                } else {\n");
      out.write("                    password1.setCustomValidity('');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function checkPasswords() {\n");
      out.write("                var password1 = document.getElementById('password');\n");
      out.write("                var password2 = document.getElementById('retypepassword');\n");
      out.write("                if (password1.value != password2.value) {\n");
      out.write("                    password2.setCustomValidity('Passwords do not match!');\n");
      out.write("                } else {\n");
      out.write("                    password2.setCustomValidity('');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function checkCaptcha() {\n");
      out.write("                var password1 = document.getElementById('captcha');\n");
      out.write("                var password2 = document.getElementById('confirm_captcha');\n");
      out.write("                if (password1.value != password2.value) {\n");
      out.write("                    password2.setCustomValidity('Captcha do not match!');\n");
      out.write("                } else {\n");
      out.write("                    password2.setCustomValidity('');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        </html>\n");
      out.write("\n");
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
