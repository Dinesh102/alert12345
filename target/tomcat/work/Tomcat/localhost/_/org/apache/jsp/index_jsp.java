/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-09 12:19:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>SO question 4112686</title>\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    function edit(){\r\n");
      out.write("      $.ajax\r\n");
      out.write("        (\r\n");
      out.write("        {\r\n");
      out.write("            url:'GetUserServlet',\r\n");
      out.write("            //data:{name:'abc'},\r\n");
      out.write("            type:'put',\r\n");
      out.write("             //cache:false,\r\n");
      out.write("            success:function(){alert(\"edit\");},\r\n");
      out.write("             }\r\n");
      out.write("    );\r\n");
      out.write("    }\r\n");
      out.write("    function del(){\r\n");
      out.write("    $.ajax\r\n");
      out.write("        (\r\n");
      out.write("        {\r\n");
      out.write("            \r\n");
      out.write("            url:'GetUserServlet',\r\n");
      out.write("            // data:{name:'abc'},\r\n");
      out.write("            type:'delete',\r\n");
      out.write("            // cache:false,\r\n");
      out.write("             success:function(){alert(\"delete\");},\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("    );\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function() {  \r\n");
      out.write("            alert(\"1\");                     \r\n");
      out.write("            $('#listbutton').click(function() { \r\n");
      out.write("                    alert(\"list\");\r\n");
      out.write("                // alert(\"2\");\r\n");
      out.write("                $.post('GetUserServlet', function() { \r\n");
      out.write("               \r\n");
      out.write("                });\r\n");
      out.write("                // alert(\"4\");\r\n");
      out.write("            });\r\n");
      out.write("            // alert(\"5\");\r\n");
      out.write("            // alert(\"6\");\r\n");
      out.write("        // $(document).ready(function() {  \r\n");
      out.write("            $('#insertbutton').click(function() { \r\n");
      out.write("                alert(\"insert\");\r\n");
      out.write("                $.get('GetUserServlet', function() {        \r\n");
      out.write("                     });\r\n");
      out.write("                     });\r\n");
      out.write("        // });\r\n");
      out.write("        // $(document).ready(function() {  \r\n");
      out.write("            // $('#listbutton').click(function() {\r\n");
      out.write("            //     alert(\"list\");\r\n");
      out.write("            //     $.put('GetUserServlet', function() {  });\r\n");
      out.write("            //          });\r\n");
      out.write("        // });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // $(\"#somebutton\").click(function(){\r\n");
      out.write("        //  $.ajax({\r\n");
      out.write("            // url:'GetUserServlet',\r\n");
      out.write("            // data:{name:'abc'},\r\n");
      out.write("            // type:'get',\r\n");
      out.write("            // cache:false,\r\n");
      out.write("            // success:function(data){\r\n");
      out.write("            //    alert(data);\r\n");
      out.write("            //    $('#somediv').text(responseText); \r\n");
      out.write("            // },\r\n");
      out.write("            // error:function(){\r\n");
      out.write("    //           alert('error');\r\n");
      out.write("    //         }\r\n");
      out.write("    //      }\r\n");
      out.write("    // );\r\n");
      out.write("// }\r\n");
      out.write("// );\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <button id=\"insertbutton\">insert</button>\r\n");
      out.write("    <button id=\"deletebutton\" onclick=\"del()\">delete</button>\r\n");
      out.write("    <button id=\"editbutton\" onclick=\"edit()\">edit</button>\r\n");
      out.write("    <button id=\"listbutton\">list</button>\r\n");
      out.write("    <p id=\"somediv\"> </p>\r\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
