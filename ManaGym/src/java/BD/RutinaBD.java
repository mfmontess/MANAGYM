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
        x.add(new Ejercicio(rs)); 
    }
    
    public void guardar (Rutina rutina, Boolean valor){ 
       if(valor){
           mgr.execute("insert into rutinas (idrutina, nombrerutina, descripcion,tiempodeduracion) values ('" + rutina.getIdrutina()
                    + "','" + rutina.getNombrerutina()+"','" + rutina.getDescripcion()+"','" + rutina.getTiempodeduracion()+"')");
       }else{
            mgr.execute("update rutinas set idrutina = '" + rutina.getIdrutina() + "', nombrerutina='" + rutina.getNombrerutina() + 
                    "', descripcion ='" + rutina.getDescripcion() + "', tiempodeduracion ='" + rutina.getTiempodeduracion() +"'");
    }
}
    public Rutina getRutina (String IdRutina){
    ArrayList x = ejecutarQuery("select *from rutinas where idrutina="+IdRutina+"");
    if(x.size()>0){
        return (Rutina) x.get(0);
    }
    Rutina rutina=null;
    return new Rutina();
    }
    
    public void eliminarrutina (Rutina rutina){
        mgr.execute("delete from rutinas where idrutina ="+rutina.getIdrutina()+"");
    }
}

