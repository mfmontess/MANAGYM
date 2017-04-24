
package Managym;

import java.sql.ResultSet;


public class Maquina {

    private String id;
    private String IdMaquina;
    private String NombreMaquina;
    
    public Maquina(String id, String IdMaquina, String NombreMaquina) {
        this.id = id;
        this.IdMaquina = IdMaquina;
        this.NombreMaquina = NombreMaquina;
    }
    
    public Maquina(String IdMaquina, String NombreMaquina) {
        this.IdMaquina = IdMaquina;
        this.NombreMaquina = NombreMaquina;
    }

    public Maquina() {
        
    }
    
     public Maquina (ResultSet rs){
        try {
            id =rs.getString("id");
            IdMaquina = rs.getString("IdMaquina");
            NombreMaquina = rs.getString("NombreMaquina");
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
    
    
    @Override
    public String toString() {
       return "\n"+IdMaquina+"\n"+NombreMaquina;
    }
}
