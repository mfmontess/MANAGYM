
package Managym;

import java.sql.ResultSet;
import java.util.ArrayList;


public class Rutina {
     private String id;
    private String idrutina;
    private String nombrerutina;
    private String descripcion;
    private String tiempodeduracion;
    private ArrayList<Ejercicio> ejercicio;

    public Rutina(){
        ejercicio = new ArrayList();
    }
    public Rutina(String idrutina, String nombrerutina, String descripcion, String tiempodeduracion) {
        this.idrutina = idrutina;
        this.nombrerutina = nombrerutina;
        this.descripcion = descripcion;
        this.tiempodeduracion = tiempodeduracion;
    }
    public Rutina(String id,String idrutina, String nombrerutina, String descripcion, String tiempodeduracion, ArrayList<Ejercicio> ejercicios) {
        this.id = id;
        this.idrutina = idrutina;
        this.nombrerutina = nombrerutina;
        this.descripcion = descripcion;
        this.tiempodeduracion = tiempodeduracion;
        this.ejercicio = ejercicio;
    }
    public Rutina(String idrutina, String nombrerutina, String descripcion, String tiempodeduracion, ArrayList<Ejercicio> ejercicios) {
        this.idrutina = idrutina;
        this.nombrerutina = nombrerutina;
        this.descripcion = descripcion;
        this.tiempodeduracion = tiempodeduracion;
        this.ejercicio = ejercicio;
    }
    
    public Rutina (ResultSet rs){
    try {
        id = rs.getString("id");
        idrutina = rs.getString("idrutina");
        nombrerutina = rs.getString("nombrerutina");
        descripcion = rs.getString("descripcion");
        tiempodeduracion = rs.getString("tiempodeduracion");
    } catch (Exception e){
    }
    }
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdrutina() {
        return idrutina;
    }

    public void setIdrutina(String idrutina) {
        this.idrutina = idrutina;
    }

    public String getNombrerutina() {
        return nombrerutina;
    }

    public void setNombrerutina(String nombrerutina) {
        this.nombrerutina = nombrerutina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempodeduracion() {
        return tiempodeduracion;
    }

    public void setTiempodeduracion(String tiempodeduracion) {
        this.tiempodeduracion = tiempodeduracion;
    }

    public ArrayList<Ejercicio> getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(ArrayList<Ejercicio> ejercicio) {
        this.ejercicio = ejercicio;
    }
    public void AgregaEjercicios (Ejercicio ejer){
    ejercicio.add(ejer);
    }
    
    @Override
    public String toString(){
        return "\n"+id+"\n"+idrutina+"\n"+nombrerutina+"\n"+descripcion+"\n"+tiempodeduracion+"\n";
    }
   // private int series;
}
