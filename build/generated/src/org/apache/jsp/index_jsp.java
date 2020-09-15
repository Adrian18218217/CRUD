package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>     \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin-top: 30px\">      \n");
      out.write("        \n");
      out.write("        <div class=\"container\">            \n");
      out.write("            <button type=\"button\" class=\"btn btn-success btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\"> Agregar Nuevo</button>\n");
      out.write("             </div>  \n");
      out.write("              \n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">               \n");
      out.write("                  \n");
      out.write("             <table class=\"table table-bordered\"  id=\"tablaDatos\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"text-center\">Id</th>\n");
      out.write("                            <th>Nombres</th>\n");
      out.write("                            <th class=\"text-center\">DNI</th>\n");
      out.write("                            <th class=\"text-center\">Acciones</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody id=\"tbodys\">\n");
      out.write("                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"text-center\"><j></td>\n");
      out.write("                            <td><j></td>\n");
      out.write("                            <td class=\"text-center\"><j></td>\n");
      out.write("                            <td class=\"text-center\">\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                <a href=\"Editar.html\" class=\"btn btn-primary\">Editar</a>\n");
      out.write("                                <a href=\"Delete.html\" class=\"btn btn-danger\">Delete</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                </table>\n");
      out.write("            </div>        \n");
      out.write("        <div class=\"container\">          \n");
      out.write("            <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\" style=\"z-index: 9999; width: 450px\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">                            \n");
      out.write("                            <h4 class=\"modal-title\" id=\"myModalLabel\">Agregar Registro</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <form action=\"\" method=\"post\">\n");
      out.write("                                <label>Nombres:</label> \n");
      out.write("                                <input type=\"text\" name=\"txtNom\" class=\"form-control\"/><br>\n");
      out.write("                                <label>DNI:</label> \n");
      out.write("                                <input type=\"text\" name=\"txtDNI\" class=\"form-control\"/>                                      \n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>                            \n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>        \n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>             \n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
