/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.*;
import Managym.*;
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
 * @author Administrator
 */
public class GestionarRutinasControlador extends HttpServlet {
    
    ArrayList <String> ejerciciosRutina = new ArrayList<String>();

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
            out.println("<title>Servlet GestionarRutinasControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestionarRutinasControlador at " + request.getContextPath() + "</h1>");
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
        String accion = request.getParameter("accion");
        if(accion.equals("Adicionar Ejercicio")){
            ArrayList <Ejercicios> ejercicios = EjercicioBD.mgr.getEjercicios();//
            ejercicios.add(new Ejercicios("1", "Mountain Climbers", "Fleccion de pecho con brazo cruzado", null));
            sesion.setAttribute("ejercicios", ejercicios);
            request.getRequestDispatcher("GestionarRutinas.jsp").forward(request, response);
        }
        else if(accion.equals("Adicionar")){            
            String ejercicio = request.getParameter("lstEjercicios");
            ejerciciosRutina.add(ejercicio);//asociar ejercicio con numero de repeticiones realizado
        }
        else if(accion.equals("Gestionar")){
            RutinaBD.mgr.guardar(new Rutina());//crea objeto rutina con todos los ejercicios seleccionados
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
