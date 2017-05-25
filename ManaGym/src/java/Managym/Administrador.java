
package Managym;

import java.util.ArrayList;

public class Administrador extends Persona {
    
    public Administrador(){
        super();
   }
  
    @Override
    public String toString() {
       return "\n"+super.getIdentificacion()+"\n"+super.getNombre();
    }
    
}
