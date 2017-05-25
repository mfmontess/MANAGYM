/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.*;
import Managym.Cliente;
import Managym.Instructor;
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
 * @author ASUS
 */
public class AsignarClientes extends HttpServlet {

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
            out.println("<title>Servlet AsignarClientes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AsignarClientes at " + request.getContextPath() + "</h1>");
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
        
        if(accion.equals("Ingresar")){
            ArrayList<Instructor> instructores = InstructorBD.mgr.getInstructores();
            ArrayList<Cliente> clientes = ClienteBD.mgr.getClientes();
            sesion.setAttribute("clientes", clientes);
            sesion.setAttribute("instructores", instructores);
            request.getRequestDispatcher("/AsignarClientes.jsp").forward(request, response);
        }
        else if(accion.equals("Gestionar")){
            int idInstructor = Integer.parseInt(request.getParameter("lstInstructores"));
            String[] clientes = obtenerClientes(request);
            asociarClientes(clientes, idInstructor);
            request.getRequestDispatcher("GestionarUsuarios.jsp").forward(request, response);
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
    
    private void asociarClientes(String[] clientes, int idInstructor) {
        for(int i = 0; i<clientes.length;i++){
            ClienteBD.mgr.updateInstructor(clientes[i],idInstructor);
        }
            
    }

    private String[] obtenerClientes(HttpServletRequest request) {
         String[] clientes = request.getParameterValues("lstClientes");
         return clientes;
    }

}
