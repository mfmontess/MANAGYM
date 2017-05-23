
package Managym;

import java.sql.ResultSet;


public class Maquina {

    private String id;
    private String IdMaquina;
    private String NombreMaquina;
    private String Caracteristicas;
    private String EstadoMaquina;
    
    public Maquina(String id, String IdMaquina, String NombreMaquina,String Caracteristicas, String EstadoMaquina) {
        this.id = id;
        this.IdMaquina = IdMaquina;
        this.NombreMaquina = NombreMaquina;
        this.Caracteristicas = Caracteristicas;
        this.EstadoMaquina = EstadoMaquina;
    }
    
    public Maquina(String IdMaquina, String NombreMaquina,String Caracteristicas,String EstadoMaquina) {
        this.IdMaquina = IdMaquina;
        this.NombreMaquina = NombreMaquina;
        this.Caracteristicas = Caracteristicas;
        this.EstadoMaquina = EstadoMaquina;
       
    }

    public Maquina() {
    }
    
     public Maquina (ResultSet rs){
        try {
            id =rs.getString("id");
            IdMaquina = rs.getString("IdMaquina");
            NombreMaquina = rs.getString("NombreMaquina");
            Caracteristicas = rs.getString("Caracteristicas");
            EstadoMaquina = rs.getString("EstadoMaquina");
        } catch (Exception e) {
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getIdMaquina() {
        return IdMaquina;
    }

    public void setIdMaquina(String IdMaquina) {
        this.IdMaquina = IdMaquina;
    }

    public String getNombreMaquina() {
        return NombreMaquina;
    }

    public void setNombreMaquina(String NombreMaquina) {
        this.NombreMaquina = NombreMaquina;
    }
    
    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getEstadoMaquina() {
        return EstadoMaquina;
    }

    public void setEstadoMaquina(String EstadoMaquina) {
        this.EstadoMaquina = EstadoMaquina;
    }
    
    @Override
    public String toString() {
       return "\n"+IdMaquina+"\n"+NombreMaquina+"\n"+Caracteristicas+"\n"+EstadoMaquina;
    }
}
