
package BD;

import Managym.Ejercicio;
import Servicios.DBManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EjercicioBD extends DBManager{
    public static EjercicioBD mgr = new EjercicioBD();
    private EjercicioBD(){
    }
    
    @Override
    protected void addObject(ArrayList x, ResultSet rs) {
        x.add(new Ejercicio(rs)); 
    }
    public Ejercicio getItem (String id){
        ArrayList x= ejecutarQuery("select * from ejercicios where id='"+id+" ");
        if(x.size()>0){
        return (Ejercicio) x.get(0);
        }
        return new Ejercicio();
    }
    public Ejercicio getEjercicio (String IdEjercicio){
    ArrayList x = ejecutarQuery("select * from ejercicios where idejercicio='"+IdEjercicio+"'");
    if(x.size()>0){
        return (Ejercicio) x.get(0);
    }
    Ejercicio ejercicio=null;
    return  ejercicio;
    }
    public void guardar (Ejercicio ejercicio, Boolean valor){ 
    if(valor){
        mgr.execute("insert into ejercicios(idejercicio,nombreejercicio,descripcionejercicio,videoejercicio) values ('" +ejercicio.getIdejercicio()+"','"+
               ejercicio.getNombreejercicio()+"' , '"+ejercicio.getDescripcionejercicio()+"' , '"+ejercicio.getVideoejercicio()+"')");
        
    }else{
    mgr.execute("update ejercicios set idejercicio ='"+ ejercicio.getIdejercicio()+"' , nombreejercicio= '"+ejercicio.getNombreejercicio()
            +"', descripcionejercicio= '"+ejercicio.getDescripcionejercicio()+"' , videoejercicio= '"+ejercicio.getVideoejercicio()+"' where id= '"+ejercicio.getId()+"'");
    }
    }
    public void eliminarEjercicio(Ejercicio ejercicio){
        mgr.execute("delete from ejercicios where idejercicio = "+ejercicio.getIdejercicio()+"");
    }
    public ArrayList<Ejercicio> getEjercicios(String IdRutina){
    ArrayList<Ejercicio> x = ejecutarQuery("select * from ejercicios where idrutina='"+IdRutina+"'");
    return x;
    }
    public ArrayList<Ejercicio> getEjercicios1(){
    ArrayList<Ejercicio> x = ejecutarQuery("select * from ejercicios ");
    return x;
    }
    public ArrayList consultarEjercicios (String valor){
    ArrayList x = ejecutarQuery("select * from ejercicios where IdEjercicio="+valor+" ");
    return x;
    }
}
