
package Managym;

import java.util.ArrayList;


public class Instructor extends Persona {
    
private int IdInstructor;
    private String NombreInstructor;
    private ArrayList<Ejercicio> ejercicios;
    
    public Instructor(int IdInstructor, String NombreInstructor, ArrayList<Ejercicio> ejercicios) {
        this.IdInstructor = IdInstructor;
        this.NombreInstructor = NombreInstructor;
        this.ejercicios = ejercicios;
    }
    
    public Instructor (){
    ejercicios = new ArrayList();
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
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
