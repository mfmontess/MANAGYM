/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.Maquina;
import Servicios.DBManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MaquinaBD extends DBManager{
    public static MaquinaBD mgr = new MaquinaBD();
    private MaquinaBD(){
    }
    @Override
    protected void addObject(ArrayList x, ResultSet rs) {
        x.add(new Maquina(rs)); 
    }
    public Maquina getItem (String id){
    ArrayList x = ejecutarQuery("select * from maquinas where id= '"+id+" ");
    if(x.size()>0){
        return (Maquina) x.get(0);
    }
    return new Maquina();
    }
    public Maquina getMaquina (String IdMaquina){
    ArrayList x = ejecutarQuery("select * from maquinas where IdMaquina= '"+IdMaquina+"'");
    if(x.size()>0){
        return (Maquina) x.get(0);
    }
    
    Maquina maquina=null;
    return  maquina;
    }
    
     public void guardar (Maquina maquina, Boolean valor){
    if(valor){
    mgr.execute("insert into maquinas(IdMaquina,NombreMaquina) values ("+maquina.getIdMaquina()+" , '" 
            +maquina.getNombreMaquina()+"')");
    }else{
    mgr.execute("update maquinas set nombre= '"+maquina.getNombreMaquina()+
            "' , iddelegacion= '"+maquina.getIdMaquina()+"' where IdMaquina= '"+maquina.getIdMaquina()+"'");
    }
    }
    public void eliminar(Maquina maquina){
    mgr.execute("delete from maquinas where IdMaquina ="+maquina.getIdMaquina()+"");
    }
    public ArrayList<Maquina> getMaquinas(){
    ArrayList<Maquina> x = ejecutarQuery("select * from maquinas");
    return x;
    }
    
    public ArrayList consultarMaquinas (String campo, String valor){
    ArrayList x = ejecutarQuery("select * from maquinas where "+campo+" ="+valor+" ");
    return x;
    }
}
