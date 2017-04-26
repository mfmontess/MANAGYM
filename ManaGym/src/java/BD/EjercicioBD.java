
package BD;

import Managym.Ejercicios;
import Servicios.DBManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EjercicioBD extends DBManager{
    public static EjercicioBD mgr = new EjercicioBD();
    private EjercicioBD(){
    }
    
    @Override
    protected void addObject(ArrayList x, ResultSet rs) {
        x.add(new Ejercicios(rs)); 
    }
    public Ejercicios getItem (String id){
        ArrayList x= ejecutarQuery("select * from ejercicios where id='"+id+" ");
        if(x.size()>0){
        return (Ejercicios) x.get(0);
        }
        return new Ejercicios();
    }
    public Ejercicios getEjercicio (String IdEjercicio){
    ArrayList x = ejecutarQuery("select * from ejercicios where IdEjercicio='"+IdEjercicio+"'");
    if(x.size()>0){
        return (Ejercicios) x.get(0);
    }
    Ejercicios ejercicio=null;
    return new Ejercicios();
    }
    public void guardar (Ejercicios ejercicio,String IdEjercicio, Boolean valor){ 
    if(valor){
        mgr.execute("insert into ejercicios(IdEjercicio,NombreEjercicio,DescripcionEjercicio,VideoEjercicio) values ('" +ejercicio.getIdEjercicio()+
               ejercicio.getNombreEjercicio()+"' , '"+ejercicio.getDescripcionEjercicio()+"' , '"+ejercicio.getVideoEjercicio()+"')");
        
    }else{
    mgr.execute("update ejercicios set IdEjercicio ='"+ ejercicio.getIdEjercicio()+"' , NombreEjercicio= '"+ejercicio.getNombreEjercicio()
            +"', DescripcionEjercicio= '"+ejercicio.getDescripcionEjercicio()+"' , VideoEjercicio= '"+ejercicio.getVideoEjercicio()+"' where idatleta= '"+ejercicio.getIdEjercicio()+"'");
    }
    }
    public void eliminarEjercicio(Ejercicios ejercicio){
        mgr.execute("delete from ejercicios where IdEjercicios = "+ejercicio.getIdEjercicio()+"");
    }
    public ArrayList<Ejercicios> getEjercicios(){
    ArrayList<Ejercicios> x = ejecutarQuery("select * from ejercicios");
    return x;
    }
    public ArrayList consultarEjercicios (String valor){
    ArrayList x = ejecutarQuery("select * from ejercicios where IdEjercicio="+valor+" ");
    return x;
    }
}
