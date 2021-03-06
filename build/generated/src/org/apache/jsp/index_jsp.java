package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import wservices.Alumno;
import Modelo.Alumno_cli;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div class=\"container\" mt-4>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\">\n");
      out.write("                    <a href=\"Controlador?accion=agregar\" class=\"btn btn-primary\">Nuevo Alumno</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <table border=\"1\" class=\"table table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                               <th>Nombres</th>\n");
      out.write("                                <th>Apellidos</th>\n");
      out.write("                                <th>Ciudad</th>\n");
      out.write("                                <th>Cargo</th>\n");
      out.write("                                <th>Estado</th>\n");
      out.write("                                <th>Opciones</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 
                                Alumno_cli acli= new Alumno_cli();
                                List<Alumno> datos= acli.lista();
                                for(Alumno u:datos){
                                    
                                
                                
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( u.getApellidoAlumno() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getNomnreAlumno() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getCiudadAlumno() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getCargoAlumno() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getEstadoAlumno() );
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a class=\"btn btn-warnig\">Editar</a>\n");
      out.write("                                    <a class=\"btn btn-danger\">Eliminar</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
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
