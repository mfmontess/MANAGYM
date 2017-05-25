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
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
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
                Usuario user = new Usuario(usuario,password,PerfilBD.mgr.getPerfil(perfil),2);
                Persona person = FactoryPersona.CrearPersona(user);
                person.setCelular(celular);
                person.setDireccion(direccion);
                person.setIdentificacion(documento);
                person.setNombre(nombre);
                if(user.getPerfil().getNombre().equals("Cliente")){
                    if(verificarEdadClientes(fechaNacimiento))
                        person.setFechaNacimiento(new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento));
                    else
                        throw new Exception("Edad invalida para un cliente, esta debe estar entre los 18 y los 50 años");
                } else
                    person.setFechaNacimiento(new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento));
                
                UsuarioBD.mgr.insert(user);
                user = UsuarioBD.mgr.getUsuario(usuario);
                person.setUsuario(user);
                PersonaBD.mgr.insert(person);
                sesion.setAttribute("mensaje", "Su registro se ha realizado satisfactoriamente, en breve espere su activación.");
            } else{
                sesion.setAttribute("mensaje", "Ya existe el código de usuario en el sistema");
            }
        } catch(Exception e){
            sesion.setAttribute("mensaje", "No se pudo registrar el usuario, intento nuevamente");
        }        
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

    private boolean verificarEdadClientes(String fechaNacimiento) {
        boolean valido = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        if (sdf.parse(fechaNacimiento, new ParsePosition(0)) != null){
            Calendar c = Calendar.getInstance();
            Date fecha = new Date(fechaNacimiento);
            c.setTime(fecha);
            Calendar cal50 = Calendar.getInstance();
            cal50.add(Calendar.YEAR, -50);
            Calendar cal18 = Calendar.getInstance();
            cal18.add(Calendar.YEAR, -18);
            if(c.compareTo(cal50) > 0 && c.compareTo(cal18) < 0)
                valido = true;
        }
        return valido;
    }
}
