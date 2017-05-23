
package Managym;

import java.sql.ResultSet;


public class Instructor extends Persona {
    
    private int IdInstructor;
    private String NombreInstructor;
    private String EspecialidadFisica;

    public String getEspecialidadFisica() {
        return EspecialidadFisica;
    }

    public void setEspecialidadFisica(String EspecialidadFisica) {
        this.EspecialidadFisica = EspecialidadFisica;
    }
    
    public Instructor(ResultSet rs){
        super(rs);
        try {
            IdInstructor = rs.getInt("IdInstructor");
            NombreInstructor = rs.getString("NombreInstructor");
            EspecialidadFisica = rs.getString("EspecialidadFisica");
        } catch (Exception e) {
        }
    }
    
    public Instructor (){
        super();
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
