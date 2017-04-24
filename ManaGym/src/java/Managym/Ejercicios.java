
package Managym;

import java.sql.ResultSet;
import java.util.ArrayList;


public class Ejercicios {

    
    private String id;
    private String IdEjercicio;
    private String NombreEjercicio;
    private String DescripcionEjercicio;
    private String VideoEjercicio;
    private ArrayList<Maquina>  maquinas;
    
    public Ejercicios(){
    maquinas= new ArrayList();
    }
    
    public Ejercicios(String id, String IdEjercicio, String NombreEjercicio, String DescripcionEjercicio, String VideoEjercicio, ArrayList<Maquina> maquinas) {
        this.id = id;
        this.IdEjercicio = IdEjercicio;
        this.NombreEjercicio = NombreEjercicio;
        this.DescripcionEjercicio = DescripcionEjercicio;
        this.VideoEjercicio =  VideoEjercicio;
        this.maquinas = maquinas;
    }
    public Ejercicios(String IdEjercicio, String NombreEjercicio, String DescripcionEjercicio, String VideoEjercicio) {
        this.IdEjercicio = IdEjercicio;
        this.NombreEjercicio = NombreEjercicio;
        this.DescripcionEjercicio = DescripcionEjercicio;
        this.VideoEjercicio =  VideoEjercicio;
    }
     public Ejercicios (ResultSet rs){
        try {
            id                                  =rs.getString("id");
            IdEjercicio                         = rs.getString("IdEjercicio");
            NombreEjercicio                  = rs.getString("NombreEjercicio");            
            DescripcionEjercicio                          = rs.getString("DescripcionEjercicio");
            VideoEjercicio                      = rs.getString("VideoEjercicio");
        } catch (Exception e) {
        }
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcionEjercicio() {
        return DescripcionEjercicio;
    }

    public void setDescripcionEjercicio(String DescripcionEjercicio) {
        this.DescripcionEjercicio = DescripcionEjercicio;
    }

    public String getVideoEjercicio() {
        return VideoEjercicio;
    }

    public void setVideoEjercicio(String VideoEjercicio) {
        this.VideoEjercicio = VideoEjercicio;
    }
    
    public String getIdEjercicio() {
        return IdEjercicio;
    }

    public void setIdEjercicio(String IdEjercicio) {
        this.IdEjercicio = IdEjercicio;
    }

    public String getNombreEjercicio() {
        return NombreEjercicio;
    }

    public void setNombreEjercicio(String NombreEjercicio) {
        this.NombreEjercicio = NombreEjercicio;
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    @Override
    public String toString() {
        return "\n"+IdEjercicio+"\n"+NombreEjercicio;
    }
    
 
}
