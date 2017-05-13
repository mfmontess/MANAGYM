
package Managym;

import java.util.ArrayList;


public class Instructor extends Persona {
    
    private int IdInstructor;
    private String NombreInstructor;
    
    public Instructor(int IdInstructor, String NombreInstructor) {
        this.IdInstructor = IdInstructor;
        this.NombreInstructor = NombreInstructor;
    }
    
    public Instructor (){
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
       return "\n"+IdInstructor+"\n"+super.getIdentificacion()+"\n"+NombreInstructor;
    }
}
