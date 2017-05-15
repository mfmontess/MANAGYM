
package Managym;

import java.util.ArrayList;


public class Cliente extends Persona {
    private int idCliente;
    private ArrayList<FichaMedica> fichas;
    private ArrayList<Rutina> rutinas;
    private ArrayList<Reporte> reportes;
 
    public Cliente (){
        fichas = new ArrayList();
        rutinas = new ArrayList();
        reportes = new ArrayList();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int id) {
        this.idCliente = id;
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
    
    @Override
    public String toString() {
       return "\n"+idCliente+"\n"+super.getIdentificacion()+"\n"+super.getNombre();
    }
}
