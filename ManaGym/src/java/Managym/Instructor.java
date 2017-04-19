
package Managym;

import java.util.ArrayList;


public class Instructor {
    
private int IdInstructor;
    private String NombreInstructor;
    private ArrayList<Ejercicios> ejercicios;
    
    public Instructor(int IdInstructor, String NombreInstructor, ArrayList<Ejercicios> ejercicios) {
        this.IdInstructor = IdInstructor;
        this.NombreInstructor = NombreInstructor;
        this.ejercicios = ejercicios;
    }
    
    public Instructor (){
    ejercicios = new ArrayList();
    }

    public ArrayList<Ejercicios> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicios> ejercicios) {
        this.ejercicios = ejercicios;
    }
    
    
    public int getIdInstructor() {
        return IdInstructor;
    }

    public void setIdInstructor(int IdInstructor) {
        this.IdInstructor = IdInstructor;
    }

    public String getNombreInstructor() {
        return NombreInstructor;
    }

    public void setNombreInstructor(String NombreInstructor) {
        this.NombreInstructor = NombreInstructor;
    }
   @Override
    public String toString() {
       return "\n"+IdInstructor+"\n"+NombreInstructor;
    }
}
