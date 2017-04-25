/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.ClienteBD;
import BD.UsuarioDAO;
import Managym.Cliente;
import Managym.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "GestionarUsuariosControlador", urlPatterns = {"/GestionarUsuariosControlador"})
public class GestionarUsuariosControlador extends HttpServlet {

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
            out.println("<title>Servlet GestionarUsuariosControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestionarUsuariosControlador at " + request.getContextPath() + "</h1>");
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
       if(accion.equals("Buscar")){
           UsuarioDAO usuario = new UsuarioDAO();
            ArrayList <Usuario> usuarios = new ArrayList <Usuario>();//
            sesion.setAttribute("clientes", usuarios);
            request.getRequestDispatcher("GestionarUsuarios.jsp").forward(request, response);
       }
       else if(accion.equals("Gestionar")){
           ArrayList <Usuario> usuarios = (ArrayList <Usuario>) sesion.getAttribute("usuarios");
           String estado = sesion.getAttribute("lstAccion").toString();
           gestionarUsuarios(usuarios, Integer.parseInt(estado));
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

    private void gestionarUsuarios(ArrayList<Usuario> usuarios, int estado) {
        UsuarioDAO usuarioBD = new UsuarioDAO();
        for(int i = 0; i<usuarios.size();i++){
            Usuario usuario = usuarios.get(i);
            usuario.setEstado(estado);
            usuarioBD.update(usuario);
        }
            
    }

}
