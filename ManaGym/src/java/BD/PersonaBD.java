/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.*;
import Servicios.DBManager;

/**
 *
 * @author Administrator
 */
public class PersonaBD extends DBManager {
    private PersonaBD(){
    }
    public static PersonaBD mgr = new PersonaBD();

    public void insert(Persona obj) throws Exception {
        switch (obj.getUsuario().getPerfil().getId()) {
            case 2:
                ClienteBD.mgr.insert((Cliente) obj);
            case 3:
                InstructorBD.mgr.insert((Instructor) obj);
            default:
                throw new Exception("Tipo de perfil no definido en el sistema");
        }
    }    
}
