
package Managym;


public class Reporte {
    private int IdReporte;
    private String NombreReporte;
    
    public Reporte(int IdReporte, String NombreReporte) {
        this.IdReporte = IdReporte;
        this.NombreReporte = NombreReporte;
    }
    
    public int getIdReporte() {
        return IdReporte;
    }

    public void setIdReporte(int IdReporte) {
        this.IdReporte = IdReporte;
    }

    public String getNombreReporte() {
        return NombreReporte;
    }

    public void setNombreReporte(String NombreReporte) {
        this.NombreReporte = NombreReporte;
    }
    
   @Override
    public String toString() {
        return "n"+IdReporte+"n"+NombreReporte;
    } 
    
}
