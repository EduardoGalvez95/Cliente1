
package cli_Controlador;

import Modelo.Alumno_cli;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Alumno_cli alu= new Alumno_cli();
    
    String add="agregar.jsp";
    String index="index.jsp";
    String acceso="";
    String edit="edit.jsp";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      String accion_cli=request.getParameter("accion");
      if(accion_cli.equals("agregar")){
          acceso=add;
        }else if(accion_cli.equals("guarda")){
            String nom=request.getParameter("nombre");
            String ape=request.getParameter("apellido");
            String ciu=request.getParameter("ciudad");
            String car=request.getParameter("cargo");
            String et=request.getParameter("estado");
            
            alu.agregar(nom, ape, ciu, car, et);
            acceso=index;
        }else if(accion_cli.equals("actualizar")){
            acceso=edit;
            request.setAttribute("iduser", request.getParameter("id"));
            
        }else if(accion_cli.equals("editar")){
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("apellido");
            String ciudad=request.getParameter("ciudad");
            String cargo= request.getParameter("cargo");
            String estado = request.getParameter("estado");
            int id=Integer.parseInt(request.getParameter("id"));
            alu.editar(nombre, apellido, ciudad, cargo, estado, id);
            acceso=index;
        }else if(accion_cli.equals("eliminar")){
              int id= Integer.parseInt(request.getParameter("id"));
              alu.eliminar(id);
              acceso=index;
        }else {
            acceso=index;
        }
      
      RequestDispatcher dispatcher= request.getRequestDispatcher(acceso);
      dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
