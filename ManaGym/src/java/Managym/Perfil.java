/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managym;

/**
 *
 * @author ASUS
 */
public class Perfil {
    private int id;
    private String nombre;

    public Perfil(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Perfil(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
}
