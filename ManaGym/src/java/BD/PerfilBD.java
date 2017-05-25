/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.Perfil;
import Servicios.DBManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PerfilBD extends DBManager {
    public static PerfilBD mgr = new PerfilBD();
    
    private PerfilBD(){}
    
    public ArrayList getPerfiles(){
        ArrayList x = ejecutarQuery("select * from Perfiles");
        return x;
    }
    
    public Perfil getPerfil(int id){
        ArrayList x = ejecutarQuery("select * from Perfiles WHERE IdPerfil = " + id);
        if (x.size() > 0)
            return (Perfil) x.get(0);
        else
            return null;
    }
    
    @Override
    protected void addObject(ArrayList x, ResultSet rs) {
        x.add(new Perfil(rs)); 
    }
}
