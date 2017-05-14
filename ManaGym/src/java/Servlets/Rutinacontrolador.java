
package Servlets;

import BD.EjercicioBD;
import BD.RutinaBD;
import Managym.Ejercicio;
import Managym.Rutina;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lenovo
 */
public class Rutinacontrolador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Rutinacontrolador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Rutinacontrolador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        HttpSession sesion = request.getSession();
        String id = request.getParameter("id");
        String idrutina = request.getParameter("idrutina");
        String nombrerutina = request.getParameter("nombrerutina");
        String descripcion = request.getParameter("descripcion");
        String tiempodeduracion = request.getParameter("tiempodeduracion");
        String accion  = request.getParameter("accion");
        Rutina rutina = new Rutina();
        if(accion.equals("Guardar")){
        rutina = new Rutina(idrutina, nombrerutina, descripcion, tiempodeduracion);
        RutinaBD.mgr.guardar(rutina, Boolean.TRUE);
        sesion.setAttribute("rutina", rutina);
        sesion.setAttribute("mensaje", "Registro guardado con exito");
        request.getRequestDispatcher("MostrarRutinas.jsp").forward(request, response);
        }else {
            if(accion.equals("Consultar")){
                idrutina = request.getParameter("idrutina");
                rutina= RutinaBD.mgr.getRutina(idrutina);
                ArrayList <Ejercicio> ejercicios =EjercicioBD.mgr.getEjercicios(idrutina);
                sesion.setAttribute("rutina", rutina);
                sesion.setAttribute("ejercicios",ejercicios);
                sesion.setAttribute("mensaje3", "El registro es:");
                request.getRequestDispatcher("Consultarrutinas.jsp").forward(request, response);
            }else{
                if(accion.equals("Eliminar")){
                    rutina = (Rutina) sesion.getAttribute("rutina");
                    RutinaBD.mgr.eliminarrutina(rutina);
                    sesion.setAttribute("rutina", rutina);
                    sesion.setAttribute("mensaje3", "Registro eliminado con exito");
                    request.getRequestDispatcher("Mostrarrutinas.jsp").forward(request, response);
                }else {
                    if(accion.equals("Modificar")){
                        rutina = (Rutina) sesion.getAttribute("rutina");
                        nombrerutina = request.getParameter("nombrerutina");
                        idrutina = request.getParameter("idrutina");
                        descripcion = request.getParameter("descripcion");
                        tiempodeduracion = request.getParameter("tiempodeduracion");
                        rutina.setIdrutina(idrutina);
                        rutina.setNombrerutina(nombrerutina);
                        rutina.setDescripcion(descripcion);
                        rutina.setTiempodeduracion(tiempodeduracion);
                        RutinaBD.mgr.guardar(rutina, Boolean.FALSE);
                        sesion.setAttribute("rutina", rutina);
                        sesion.setAttribute("mensaje3", "Registro modificado con exito");
                        request.getRequestDispatcher("Mostrarrutinas.jsp").forward(request, response);
                    }else {
                        request.getRequestDispatcher("GestionarRutinas.jsp").forward(request, response);
                    }
                }
            }
        }
        
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
