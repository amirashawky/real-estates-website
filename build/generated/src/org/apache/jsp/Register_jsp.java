package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("       \n");
      out.write("                if (document.myForm.name.value === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please provide your name!\");\n");
      out.write("                    document.myForm.name.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (document.myForm.email.value === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please provide your Email!\");\n");
      out.write("                    document.myForm.email.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (document.myForm.password.value.length < 8) {\n");
      out.write("                    alert(\"your password length must be 8 at least!\");\n");
      out.write("                    document.myForm.password.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (document.myForm.phone.value === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please provide a phone number.\");\n");
      out.write("                    document.myForm.phone.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (isNaN(document.myForm.phone.value)) {\n");
      out.write("                    document.getElementById(\"phone\").innerHTML = \"Enter valid phone number\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (document.myForm.birth.value === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please provide your birthdate!\");\n");
      out.write("                    document.myForm.birth.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return(true);\n");
      out.write("                cosole.log(\"nnnnn\");\n");
      out.write("            }\n");
      out.write("            function checkname(){\n");
      out.write("                       \n");
      out.write("            var name = document.getElementById(\"name\").value;\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\",\"RegisterServlet?name=\"+name,true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange=function()\n");
      out.write("            {\n");
      out.write("                if (xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("                {\n");
      out.write("                    \n");
      out.write("                    //alert(\"reponse = \" + xmlhttp.responseText);\n");
      out.write("                    document.getElementById(\"checkname\").innerHTML = xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                padding:0;\n");
      out.write("                margin:0;\n");
      out.write("                border: 0;\n");
      out.write("                font-family:sans-serif;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                background-color:#008080;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                width: 500px;\n");
      out.write("                height: 40px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                font-size: 15px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: #004d4d ;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            h3{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 40px;\n");
      out.write("                font-family: serif;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #008080;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 40px;\n");
      out.write("                color: white;\n");
      out.write("                background:#008080;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            select{\n");
      out.write("              margin-bottom: 30px; \n");
      out.write("              width:500px;\n");
      out.write("              height: 30px;\n");
      out.write("              background-color:#008080;\n");
      out.write("              color: white;\n");
      out.write("              border-radius: 15px;\n");
      out.write("              font-size: 15px;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            ::-ms-input-placeholder { \n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                border-radius: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                border:1px solid gray;\n");
      out.write("                background-color:#f2f2f2;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <div style=\"width: 700px;height:auto; margin-left:28% ;margin-top: 30px;\">\n");
      out.write("        <h3> Registration Form </h3>\n");
      out.write("        <form class=\"register\" method=\"Post\" action=\"RegisterServlet\" name=\"myForm\" onsubmit=\"return(validate());\">\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" placeholder=\" Name\" onkeyup=\"checkname()\"/>\n");
      out.write("            <p id=\"checkname\" style=\"color:red\"> </p>\n");
      out.write("            <br/><br/>\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\" Email\"/>\n");
      out.write("            <br/><br/>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\" Password\"/>\n");
      out.write("            <br/><br/>\n");
      out.write("            <input type=\"text\" name=\"phone\" placeholder=\" Phone Number\"/><br>\n");
      out.write("            <span style=\"color:red;\" id=\"phone\"></span>\n");
      out.write("            <br/><br/>\n");
      out.write("            <select name=\"item\">\n");
      out.write("                <option value=\"empty\"> Select your gender</option>\n");
      out.write("                <option value=\"Female\"> Female</option>\n");
      out.write("                <option value=\"Male\"> Male</option>\n");
      out.write("            </select>\n");
      out.write("            <br/><br/>\n");
      out.write("            <input type=\"text\" name=\"birth\" placeholder=\" Birth date\"/>\n");
      out.write("            <br/><br/>\n");
      out.write("            <font color=\"#DD0000\">Enter Code</font> <br><span id=\"txtCaptchaDiv\" style=\"background-color:#A51D22;color:#FFF;padding:5px;width:200px;\"></span>\n");
      out.write("            <input type=\"hidden\" id=\"txtCaptcha\" />\n");
      out.write("            <input type=\"text\" style=\"width:200px;\"name=\"txtInput\" id=\"txtInput\" size=\"15\" />\n");
      out.write("            <button  onclick = \"return checkform();\" > submit </button>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">SignUp</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function checkform() {\n");
      out.write("                var message = \"\";\n");
      out.write("\n");
      out.write("                if (document.getElementById(\"txtInput\").value == \"\") {\n");
      out.write("                    message += \"Must Verfiy Code.\\n\";\n");
      out.write("                }\n");
      out.write("                if (document.getElementById(\"txtInput\").value != \"\") {\n");
      out.write("                    if (ValidCaptcha(document.getElementById(\"txtInput\").value) == false) {\n");
      out.write("                        message += \"Invalid Code.\\n\";\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    else \n");
      out.write("                    {\n");
      out.write("                      message += \"valid Code.\\n\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                if (message != \"\") {\n");
      out.write("                    alert(message);\n");
      out.write("                    return false;\n");
      out.write("                }          \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            //Generates the captcha function\n");
      out.write("            var a = Math.ceil(Math.random() * 9) + '';\n");
      out.write("            var b = Math.ceil(Math.random() * 9) + '';\n");
      out.write("            var c = Math.ceil(Math.random() * 9) + '';\n");
      out.write("            var d = Math.ceil(Math.random() * 9) + '';\n");
      out.write("            var e = Math.ceil(Math.random() * 9) + '';\n");
      out.write("\n");
      out.write("            var code = a + b + c + d + e;\n");
      out.write("            document.getElementById(\"txtCaptcha\").value = code;\n");
      out.write("            document.getElementById(\"txtCaptchaDiv\").innerHTML = code;\n");
      out.write("\n");
      out.write("            // Validate the Entered input aganist the generated security code function\n");
      out.write("            function ValidCaptcha() {\n");
      out.write("                var str1 = removeSpaces(document.getElementById('txtCaptcha').value);\n");
      out.write("                var str2 = removeSpaces(document.getElementById('txtInput').value);\n");
      out.write("                if (str1 == str2) {\n");
      out.write("                    return true;\n");
      out.write("                } else {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Remove the spaces from the entered and generated code\n");
      out.write("            function removeSpaces(string) {\n");
      out.write("                return string.split(' ').join('');\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </script>\n");
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
