/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.*;
import Servicios.DBManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PersonaBD extends DBManager {
    private PersonaBD(){
    }
    public static PersonaBD mgr = new PersonaBD();
    
    @Override
    protected void addObject(ArrayList x, ResultSet rs) {
        x.add(new Persona(rs)); 
    }

    public void insert(Persona obj) throws Exception {
        switch (obj.getUsuario().getPerfil().getId()) {
            case 1:
                ClienteBD.mgr.insert((Cliente) obj);
            case 2:
                InstructorBD.mgr.insert((Instructor) obj);
            default:
                throw new Exception("Tipo de perfil no definido en el sistema");
        }
    }    

    public Persona getPersona(String documento) {
        ArrayList x = ejecutarQuery("select CedulaInstructor as DocumentoPersona, NombreInstructor as NombrePersona, TelefonoInstructor as TelefonoPersona, '' as DireccionPersona"
                + " from Instructores where CedulaInstructor = "+documento+" UNION "
                + "select CedulaCliente as DocumentoPersona, NombreCliente as NombrePersona, TelefonoCliente as TelefonoPersona, DireccionCliente as DireccionPersona"
                + " from Instructores where CedulaInstructor = "+documento);
        if (x.size() > 0)
            return (Persona) x.get(0);
        else
            return null;
    }
}
