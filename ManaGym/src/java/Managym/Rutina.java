
package Managym;

import java.util.ArrayList;


public class Rutina {
    private int IdRutina;
    private String NombreRutina;
    private ArrayList<Ejercicios> ejercicios;
    
    public Rutina(int IdRutina, String NombreRutina, ArrayList<Ejercicios> ejercicios) {
        this.IdRutina = IdRutina;
        this.NombreRutina = NombreRutina;
        this.ejercicios = ejercicios;
    }
    public Rutina(){
        ejercicios = new ArrayList();
    }
    public int getIdRutina() {
        return IdRutina;
    }

    public void setIdRutina(int IdRutina) {
        this.IdRutina = IdRutina;
    }

    public String getNombreRutina() {
        return NombreRutina;
    }

    public void setNombreRutina(String NombreRutina) {
        this.NombreRutina = NombreRutina;
    }

    public ArrayList<Ejercicios> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicios> ejercicios) {
        this.ejercicios = ejercicios;
    }
    
    @Override
    public String toString() {
        return "n"+IdRutina+"n"+NombreRutina;
    }
    
}
