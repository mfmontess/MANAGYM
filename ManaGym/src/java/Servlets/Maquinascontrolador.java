/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.MaquinaBD;
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
        String id = request.getParameter("id");
        String IdMaquina = request.getParameter("IdMaquina");
        String NombreMaquina= request.getParameter("NombreMaquina");
        String Caracteristicas= request.getParameter("Caracteristicas");
        String EstadoMaquina= request.getParameter("EstadoMaquina");
        String maquina1= request.getParameter("maquina");
        String accion = request.getParameter("accion");
        Maquina maquina = new Maquina();
        System.out.println("este es el error"+accion);
        if(accion.equals("Guardar")){
            maquina = new Maquina (IdMaquina,NombreMaquina,Caracteristicas,EstadoMaquina);
            MaquinaBD.mgr.guardar(maquina, true);
            sesion.setAttribute("maquina", maquina);
            sesion.setAttribute("mensaje", "Registro guardado con exito");
           request.getRequestDispatcher("MostrarMaquinas.jsp").forward(request, response);
        }else{
            if(accion.equals("Consultar")){
                IdMaquina = request.getParameter("IdMaquina");
                maquina= MaquinaBD.mgr.getMaquina(IdMaquina);
                ArrayList <Maquina> maquinas = MaquinaBD.mgr.getMaquinas();
                sesion.setAttribute("maquinas", maquinas);
                sesion.setAttribute("maquina", maquina);
                sesion.setAttribute("mensaje", "El registro es:");
                request.getRequestDispatcher("ConsultarMaquinas.jsp").forward(request, response);
            }else{
                if(accion.equals("Eliminar")){
                    maquina = (Maquina) sesion.getAttribute("maquina");
                    MaquinaBD.mgr.eliminar(maquina);
                    sesion.setAttribute("maquina", maquina);
                    sesion.setAttribute("mensaje", "Registro eliminado con exito");
                   request.getRequestDispatcher("MostrarMaquinas.jsp").forward(request, response);
                }else{
                    if(accion.equals("Modificar")){
                        maquina = (Maquina) sesion.getAttribute("maquina");
                        NombreMaquina = request.getParameter("NombreMaquina");
                        IdMaquina = request.getParameter("IdMaquina");
                        MaquinaBD.mgr.guardar(maquina, false);
                        sesion.setAttribute("maquina", maquina);
                        sesion.setAttribute("mensaje", "Registro modificado con exito");
                        request.getRequestDispatcher("MostrarMaquinas.jsp").forward(request, response);
                    }else{
                        request.getRequestDispatcher("GestionarMaquinas.jsp").forward(request, response);
                        
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
