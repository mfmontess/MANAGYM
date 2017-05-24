/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.Instructor;
import Servicios.DBManager;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class InstructorBD extends DBManager {
    private InstructorBD(){
    }
    public static InstructorBD mgr = new InstructorBD();

    public void insert(Instructor instructor) {
        execute("INSERT INTO Instructores (IdUsuario,CedulaInstructor,NombreInstructor,IdEspecialidad,TelefonoInstructor) VALUES ("
                + instructor.getUsuario().getId() +"," + instructor.getIdentificacion() + "'" + instructor.getNombre() + "')");
    }    

    public ArrayList<Instructor> getInstructores() {
        ArrayList x = ejecutarQuery("select * from instructores");
        return x;
    }
}
