/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.EjercicioBD;
import BD.MaquinaBD;
import Managym.Ejercicio;
import Managym.Maquina;
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
public class Ejercicioscontrolador extends HttpServlet {

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
            out.println("<title>Servlet Ejercicioscontrolador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicioscontrolador at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
        HttpSession sesion = request.getSession();
        String id= request.getParameter("id");
        String idejercicio = request.getParameter("idejercicio");
        String nombreejercicio = request.getParameter("nombreejercicio");
        String descripcionejercicio = request.getParameter("descripcionejercicio");
        String videoejercicio = request.getParameter("videoejercicio");
        String ejercicio1 = request.getParameter("ejercicio");
        String accion = request.getParameter("accion");
        Ejercicio ejercicio = new Ejercicio();
        if(accion.equals("Guardar")){
            ejercicio = new Ejercicio(idejercicio, videoejercicio, descripcionejercicio, videoejercicio);
            EjercicioBD.mgr.guardar(ejercicio, true);
            sesion.setAttribute("ejercicio", ejercicio);
            sesion.setAttribute("mensaje", "Registro guardado con exito");
            request.getRequestDispatcher("MostrarEjercicios.jsp").forward(request, response);
        }else{
            if(accion.equals("Consultar")){
                idejercicio = request.getParameter("idejercicio");
                ejercicio = EjercicioBD.mgr.getEjercicio(idejercicio);
                ArrayList <Ejercicio> ejercicios = EjercicioBD.mgr.getEjercicios1();
                ArrayList <Maquina> maquinas = MaquinaBD.mgr.consultarMaquinas("idmaquina");
                sesion.setAttribute("ejercicios", ejercicios);
                sesion.setAttribute("maquinas", maquinas);
                sesion.setAttribute("ejercicio", ejercicio);
                sesion.setAttribute("mensaje", "El registro es:");
                request.getRequestDispatcher("ConsultarEjercicios.jsp").forward(request, response);
            }else{
                if(accion.equals("Eliminar")){
                ejercicio = (Ejercicio) sesion.getAttribute("ejercicio");
                EjercicioBD.mgr.eliminarEjercicio(ejercicio);
                sesion.setAttribute("ejercicio", ejercicio);
                sesion.setAttribute("mensaje", "Registro eliminado con exito");
                request.getRequestDispatcher("MostrarEjercicios.jsp").forward(request, response);
                }else{
                if(accion.equals("Modificar")){
                    ejercicio = (Ejercicio) sesion.getAttribute("ejercicio");
                    nombreejercicio = request.getParameter("nombreejercicio");
                    idejercicio = request.getParameter("idejercicio");
                    descripcionejercicio = request.getParameter("descripcionejercicio");
                    videoejercicio= request.getParameter("videoejercicio");
                    ejercicio.setIdejercicio(idejercicio);
                    ejercicio.setNombreejercicio(nombreejercicio);
                    ejercicio.setNombreejercicio(descripcionejercicio);
                    ejercicio.setVideoejercicio(videoejercicio);
                    EjercicioBD.mgr.guardar(ejercicio, false);
                    sesion.setAttribute("ejercicio", ejercicio);
                    sesion.setAttribute("mensaje", "Registro modificado con exito");
                    request.getRequestDispatcher("MostrarEjercicios.jsp").forward(request, response);
                }else{
                    request.getRequestDispatcher("GestionarEjercicios.jsp").forward(request, response);
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
