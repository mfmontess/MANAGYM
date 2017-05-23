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
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
public class RegistroUsuarioControlador extends HttpServlet {

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
            out.println("<title>Servlet RegistroUsuarioControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroUsuarioControlador at " + request.getContextPath() + "</h1>");
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
        String msj = "";
        try{
            String documento = request.getParameter("documento");
            String usuario = request.getParameter("usuario");
            String nombre = request.getParameter("nombre");
            String direccion = request.getParameter("direccion");
            String celular = request.getParameter("celular");
            String password = request.getParameter("pass");
            String fechaNacimiento = request.getParameter("fechaNacimiento");
            int perfil = Integer.parseInt(request.getParameter("perfil"));
            
            if(!verificarExistencia(usuario, documento)){
                Usuario user = new Usuario(usuario,password,new Perfil(perfil),2);
                UsuarioBD.mgr.insert(user);
                Persona person = FactoryPersona.CrearPersona(user);
                person.setCelular(celular);
                person.setDireccion(direccion);
                person.setIdentificacion(documento);
                person.setNombre(nombre);
                person.setFechaNacimiento(new Date(fechaNacimiento));
                PersonaBD.mgr.insert(person);
                msj = "Su registro se ha realizado satisfactoriamente, en breve espere su activación.";
                sesion.setAttribute("persona", person);
            } else{
                throw new Exception("Ya existe el código de usuario en el sistema");
            }
        } catch(Exception e){
            msj = "No se pudo registrar el usuario debido al siguiente error: " + e.getMessage();
        }
        sesion.setAttribute("error", msj);
        request.getRequestDispatcher("RegistrarUsuario.jsp").forward(request, response);
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

    private boolean verificarExistencia(String usuario, String documento) {
        
        Usuario user = UsuarioBD.mgr.getUsuario(usuario);
        Persona person = PersonaBD.mgr.getPersona(documento);
        
        return user != null || person != null;
    }

}
