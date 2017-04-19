
package Managym;

import java.util.ArrayList;


public class Cliente {
    private int     identificacion;
    private String  NombreCliente;
private ArrayList<FichaMedica> fichas;
    private ArrayList<Rutina> rutinas;
    private ArrayList<Reporte> reportes;
     
    public Cliente(int identificacion, String NombreCliente) {
        this.identificacion = identificacion;
        this.NombreCliente = NombreCliente;
    }
 
     public Cliente (){
    fichas = new ArrayList();
    rutinas = new ArrayList();
    reportes = new ArrayList();
    }
     
    public ArrayList<FichaMedica> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<FichaMedica> fichas) {
        this.fichas = fichas;
    }

    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(ArrayList<Rutina> rutinas) {
        this.rutinas = rutinas;
    }

    public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
    }
    
  
    
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    @Override
    public String toString() {
       return "\n"+identificacion+"\n"+NombreCliente;
    }
}
