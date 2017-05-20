/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.FichaMedicaBD;
import Managym.Cliente;
import Managym.FichaMedica;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lenovo
 */
public class FichaMedicaControlador extends HttpServlet {

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
            out.println("<title>Servlet FichaMedicaControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FichaMedicaControlador at " + request.getContextPath() + "</h1>");
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
        String IdFicha = request.getParameter("IdFicha");
        String Peso = request.getParameter("Peso");
        String Altura = request.getParameter("Altura");
        String AnchoEspalda = request.getParameter("AnchoEspalda");
        String ContornoBrazo = request.getParameter("ContornoBrazo");
        String ContornoCintura = request.getParameter("ContornoCintura");
        String ContornoMuslo = request.getParameter("ContornoMuslo");
        String ContornoPantorrilla = request.getParameter("ContornoPantorrilla");
        String ContornoPecho = request.getParameter("ContornoPecho");
        String FechaActualizacion = request.getParameter("FechaActualizacion");
        String accion = request.getParameter("accion");
        FichaMedica fichamedica = new FichaMedica();
        
        if(accion.equals("Guardar")){
            Cliente cliente = (Cliente) sesion.getAttribute("cliente");
            FichaMedica ficha=new FichaMedica(AnchoEspalda, ContornoBrazo, ContornoCintura, ContornoMuslo, ContornoPantorrilla, ContornoPecho, FechaActualizacion, IdFicha, Peso, Altura);
            FichaMedicaBD.mgr.guardar(ficha, cliente.getIdentificacion(), Boolean.TRUE);
            sesion.setAttribute("fichamedica", fichamedica);
            sesion.setAttribute("mensaje4", "Ficha guardada con exito");
            fichamedica.setIdFicha(IdFicha);
            fichamedica.setPeso(Peso);
            fichamedica.setAltura(Altura);
            fichamedica.setAnchoEspalda(AnchoEspalda);
            fichamedica.setContornoBrazo(ContornoBrazo);
            fichamedica.setContornoCintura(ContornoCintura);
            fichamedica.setContornoMuslo(ContornoMuslo);
            fichamedica.setContornoPantorrilla(ContornoPantorrilla);
            fichamedica.setContornoPecho(ContornoPecho);
            fichamedica.setFechaActualizacion(FechaActualizacion);
            request.getRequestDispatcher("MostrarFicha.jsp").forward(request, response);
        }else{
            if(accion.equals("Consultar")){
                Cliente cliente =(Cliente) sesion.getAttribute("cliente");
                IdFicha = request.getParameter("IdFicha");
                fichamedica = FichaMedicaBD.mgr.getFichaMedica(IdFicha, cliente.getIdentificacion());
                sesion.setAttribute("fichamedica", fichamedica);
                request.getRequestDispatcher("ConsultarFicha.jsp").forward(request, response);
            }else{
                if(accion.equals("Eliminar")){
                    fichamedica = (FichaMedica) sesion.getAttribute("fichamedica");
                    FichaMedicaBD.mgr.eliminarficha(fichamedica);
                    sesion.setAttribute("fichamedica", fichamedica);
                    sesion.setAttribute("mensaje4", "Ficha eliminada con exito");
                    request.getRequestDispatcher("MostrarFicha.jsp").forward(request, response);
                }else{
                    if(accion.equals("Modificar")){
                        fichamedica = (FichaMedica) sesion.getAttribute("fichamedica");
                        Cliente cliente = (Cliente) sesion.getAttribute("cliente");
                        IdFicha = request.getParameter("IdFicha");
                        Peso = request.getParameter("Peso");
                        Altura = request.getParameter("Altura");
                        AnchoEspalda = request.getParameter("AnchoEspalda");
                        ContornoMuslo = request.getParameter("ContornoMuslo");
                        ContornoPantorrilla = request.getParameter("ContornoPantorrilla");
                        ContornoBrazo = request.getParameter("ContornoBrazo");
                        ContornoCintura = request.getParameter("ContornoCintura");
                        ContornoPecho = request.getParameter("ContornoPecho");
                        FechaActualizacion = request.getParameter("FechaActualizacion");
                        fichamedica.setIdFicha(IdFicha);
                        fichamedica.setPeso(Peso);
                        fichamedica.setAltura(Altura);
                        fichamedica.setAnchoEspalda(AnchoEspalda);
                        fichamedica.setContornoBrazo(ContornoBrazo);
                        fichamedica.setContornoCintura(ContornoCintura);
                        fichamedica.setContornoMuslo(ContornoMuslo);
                        fichamedica.setContornoPantorrilla(ContornoPantorrilla);
                        fichamedica.setContornoPecho(ContornoPecho);
                        fichamedica.setFechaActualizacion(FechaActualizacion);
                        FichaMedicaBD.mgr.guardar(fichamedica, cliente.getIdentificacion(), Boolean.FALSE);
                        sesion.setAttribute("fichamedica", fichamedica);
                        sesion.setAttribute("mensaje4", "Ficha modificada con exito");
                        request.getRequestDispatcher("MostrarFicha.jsp").forward(request, response);
                    }else {
                        request.getRequestDispatcher("GestionarFicha.jsp").forward(request, response);
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
