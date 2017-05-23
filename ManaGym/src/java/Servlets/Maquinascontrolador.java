/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.MaquinaBD;
import Managym.Maquina;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author lenovo
 */
public class Maquinascontrolador extends HttpServlet {

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
            out.println("<title>Servlet Maquinascontrolador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Maquinascontrolador at " + request.getContextPath() + "</h1>");
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
        if(accion.equals("Consultar")){
            String IdMaquina = request.getParameter("IdMaquina");
            Maquina maquina= MaquinaBD.mgr.getMaquina(IdMaquina);
            if(maquina == null) {
                maquina = new Maquina();
                maquina.setIdMaquina(IdMaquina);
                sesion.setAttribute("estado", "Nuevo");
            }else
                sesion.setAttribute("estado", "Existente");
            
            sesion.setAttribute("maquina", maquina);
            request.getRequestDispatcher("/GestionarMaquinas.jsp").forward(request, response);
        }else if(accion.equals("Guardar")){
            String estado = sesion.getAttribute("estado").toString();
            String IdMaquina = request.getParameter("IdMaquina");
            String NombreMaquina= request.getParameter("NombreMaquina");
            String Caracteristicas= request.getParameter("Caracteristicas");
            String EstadoMaquina= request.getParameter("EstadoMaquina");
            Maquina maquina = new Maquina (IdMaquina,NombreMaquina,Caracteristicas,EstadoMaquina);
            if(estado.equals("Nuevo"))
                MaquinaBD.mgr.guardar(maquina, true);
            else if(estado.equals("Existente"))
                MaquinaBD.mgr.guardar(maquina, false);
            
            sesion.setAttribute("maquina", null);
            sesion.setAttribute("mensaje", "Registro guardado con exito");
            request.getRequestDispatcher("GestionarMaquinas.jsp").forward(request, response);
        }else if(accion.equals("Eliminar")){
            Maquina maquina = (Maquina) sesion.getAttribute("maquina");
            MaquinaBD.mgr.eliminar(maquina);
            sesion.setAttribute("maquina", null);
            sesion.setAttribute("mensaje", "Registro eliminado con exito");
            request.getRequestDispatcher("GestionarMaquinas.jsp").forward(request, response);
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
