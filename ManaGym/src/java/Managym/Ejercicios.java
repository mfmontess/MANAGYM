
package Managym;

import java.util.ArrayList;


public class Ejercicios {
    private int IdEjercicio;
    private String NombreEjercicio;
    private ArrayList<Maquina>  maquinas;
    
    public Ejercicios(){
    maquinas= new ArrayList();
    }
    
    public Ejercicios(int IdEjercicio, String NombreEjercicio, ArrayList<Maquina> maquinas) {
        this.IdEjercicio = IdEjercicio;
        this.NombreEjercicio = NombreEjercicio;
        this.maquinas = maquinas;
    }
    
    public int getIdEjercicio() {
        return IdEjercicio;
    }

    public void setIdEjercicio(int IdEjercicio) {
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
