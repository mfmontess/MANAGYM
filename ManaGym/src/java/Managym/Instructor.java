
package Managym;

public class Instructor extends Persona {
    
    private int IdInstructor;
    
    public Instructor (){
    }    
    
    public int getIdInstructor() {
        return IdInstructor;
    }

    public void setIdInstructor(int IdInstructor) {
        this.IdInstructor = IdInstructor;
    }
    
   @Override
    public String toString() {
       return "\n"+IdInstructor+"\n"+super.getIdentificacion()+"\n"+super.getNombre();
    }
}
