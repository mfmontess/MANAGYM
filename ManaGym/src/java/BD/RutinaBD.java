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
public class RutinaBD extends DBManager {
    public static RutinaBD mgr = new RutinaBD();
    
    @Override
    protected void addObject(ArrayList x, ResultSet rs) {
        x.add(new Ejercicios(rs)); 
    }
    
    public void guardar (Rutina rutina){ 
        mgr.execute("insert into rutinas (IdRutina, NombreRutina, IdEstado) values (" + rutina.getIdRutina()
                    + ",'" + rutina.getNombreRutina() +"',1)");
        for(int i = 0; i < rutina.getEjercicios().size(); i++)
            mgr.execute("insert into rutinasejercicios (IdMaquinaEjercicio, IdRutina, Repeticiones, Series) values (" + rutina.getIdRutina() + "," + rutina.getEjercicios().get(i).getId() + "," + rutina.getSeries() + ")");
    }
}
