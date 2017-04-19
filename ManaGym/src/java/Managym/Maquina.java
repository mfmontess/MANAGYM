
package Managym;


public class Maquina {
    private int IdMaquina;
    private String NombreMaquina;
    
    
    public Maquina(int IdMaquina, String NombreMaquina) {
        this.IdMaquina = IdMaquina;
        this.NombreMaquina = NombreMaquina;
    }

    
    public int getIdMaquina() {
        return IdMaquina;
    }

    public void setIdMaquina(int IdMaquina) {
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
