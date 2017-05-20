package BD;


import Managym.FichaMedica;
import Servicios.DBManager;
import java.util.ArrayList;
import java.sql.ResultSet;


public class FichaMedicaBD extends DBManager{
    public static FichaMedicaBD mgr = new FichaMedicaBD();
    private FichaMedicaBD(){
    }
    
    @Override
    protected void addObject (ArrayList x, ResultSet rs){
    x.add(new FichaMedica(rs));
    }
    public FichaMedica getItem (String id){
    ArrayList x= ejecutarQuery("select *from fichasmedicasclientes where id= '"+id+"' ");
    if(x.size()>0){
    return (FichaMedica) x.get(0);
    }
    return new FichaMedica();
    }
    
    public FichaMedica getFichaMedica (String IdFichaMedica, String IdCliente){
    ArrayList x= ejecutarQuery("select *from fichasmedicasclientes where idficha='"+IdFichaMedica+"' and idcliente= '"+IdCliente+"'");
    if(x.size()>0){
        return (FichaMedica) x.get(0);
    }
    FichaMedica fichamedica=null;
    return new FichaMedica();
    }
    
    public void guardar (FichaMedica fichamedica, String IdCliente, Boolean valor){
    if(valor){
        mgr.execute("insert into fichasmedicasclientes(IdFicha,Peso, Altura, AnchoEspalda,ContornoBrazo, ContornoCintura, ContornoPecho,ContornoMuslo,ContornoPantorrilla,FechaActualizacion,idcliente) values ('"+
                fichamedica.getIdFicha()+"','"+fichamedica.getPeso()+"','"+fichamedica.getAltura()+"','"+fichamedica.getAnchoEspalda()+"','"
        +fichamedica.getContornoBrazo()+"','"+fichamedica.getContornoCintura()+"','"+fichamedica.getContornoPecho()+"','"+fichamedica.getContornoMuslo()+"','"
        +fichamedica.getContornoPantorrilla()+"','"+fichamedica.getFechaActualizacion()+"','"+IdCliente+"')");
    }else { 
        mgr.execute("update fichasmedicasclientes set IdFicha = '"+fichamedica.getIdFicha()+"', Peso='"+fichamedica.getPeso()+"', Altura='"+fichamedica.getAltura()+
                "', AnchoEspalda='"+fichamedica.getAnchoEspalda()+"', ContornoBrazo ='"+fichamedica.getContornoBrazo()+"', ContornoCintura='"+fichamedica.getContornoCintura()+
                "', ContornoPecho='"+fichamedica.getContornoPecho()+"', ContornoMuslo ='"+fichamedica.getContornoMuslo()+"', ContornoPantorrilla='"+fichamedica.getContornoPantorrilla()+
                "', FechaActualizacion='"+fichamedica.getFechaActualizacion()+"'where id= '"+fichamedica.getId()+"'");
    }
    }
    
    public void eliminarficha(FichaMedica fichamedica){
    mgr.execute("delete from fichasmedicascliente where IdFicha ='"+fichamedica.getIdFicha()+"'");
    }
    public ArrayList<FichaMedica> getFichasMedicas(String IdCliente){
    ArrayList<FichaMedica> x = ejecutarQuery("select *from fichasmedicasclientes where idcliente ='"+IdCliente+"'");
    return x;
    }
    public ArrayList consultarFichas (String campo, String valor){
    ArrayList x= ejecutarQuery("select *from fichasmedicas where"+campo+" ="+valor+"");
    return x;
    }
}
