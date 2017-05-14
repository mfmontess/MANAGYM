/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managym;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Ejercicio {
    private String id;
    private String idejercicio;
    private String nombreejercicio;
    private String descripcionejercicio;
    private String videoejercicio;
    private ArrayList<Maquina> maquinas;
    
    public Ejercicio(String id, String idejercicio, String nombreejercicio, String descripcionejercicio, String videoejercicio, ArrayList<Maquina> maquinas) {
        this.id = id;
        this.idejercicio = idejercicio;
        this.nombreejercicio = nombreejercicio;
        this.descripcionejercicio = descripcionejercicio;
        this.videoejercicio = videoejercicio;
        this.maquinas = maquinas;
    }
    public Ejercicio(String id, String idejercicio, String nombreejercicio, String descripcionejercicio, String videoejercicio) {
        this.id = id;
        this.idejercicio = idejercicio;
        this.nombreejercicio = nombreejercicio;
        this.descripcionejercicio = descripcionejercicio;
        this.videoejercicio = videoejercicio;
    }
    public Ejercicio(String idejercicio, String nombreejercicio, String descripcionejercicio, String videoejercicio) {
        this.idejercicio = idejercicio;
        this.nombreejercicio = nombreejercicio;
        this.descripcionejercicio = descripcionejercicio;
        this.videoejercicio = videoejercicio;
    }
    public Ejercicio (ResultSet rs){
    try {
        id  =rs.getString("id");
        idejercicio = rs.getString("idejercicio");
        nombreejercicio = rs.getString("nombreejercicio");
        descripcionejercicio =rs.getString("descripcionejercicio");
        videoejercicio=rs.getString("videoejercicio");
    } catch (Exception e){
    }
    }
    public Ejercicio(){
    maquinas = new ArrayList();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdejercicio() {
        return idejercicio;
    }

    public void setIdejercicio(String idejercicio) {
        this.idejercicio = idejercicio;
    }

    public String getNombreejercicio() {
        return nombreejercicio;
    }

    public void setNombreejercicio(String nombreejercicio) {
        this.nombreejercicio = nombreejercicio;
    }

    public String getDescripcionejercicio() {
        return descripcionejercicio;
    }

    public void setDescripcionejercicio(String descripcionejercicio) {
        this.descripcionejercicio = descripcionejercicio;
    }

    public String getVideoejercicio() {
        return videoejercicio;
    }

    public void setVideoejercicio(String videoejercicio) {
        this.videoejercicio = videoejercicio;
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }
    public void Agregamaquinas(Maquina maquina){
        maquinas.add(maquina);
    }
    @Override
    public String toString(){
        return "\n"+id+"\n"+idejercicio+"\n"+nombreejercicio+"\n"+descripcionejercicio+"\n"+videoejercicio+"\n";
    }
}
