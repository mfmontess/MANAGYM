/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managym;

import java.sql.ResultSet;

/**
 *
 * @author daniel
 */
public class Usuario {
   private int id;   
    private String nombreUsuario;
    private String contraseña;
    private Perfil perfil;
    private int estado;
    

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, Perfil perfil, int estado) {
        this.nombreUsuario = usuario;
        this.contraseña = contraseña;
        this.perfil = perfil;
        this.estado = estado;
    }
    
    public Usuario(ResultSet rs){        
        try {
            id = rs.getInt("IdUsuario");
            nombreUsuario = rs.getString("NombreUsuario");
            contraseña = rs.getString("ContrasenaUsuario");            
            perfil = new Perfil(rs.getInt("IdPerfil"), rs.getString("NombrePerfil"));
            estado = rs.getInt("IdEstado");
        } catch (Exception e) {
        }
    }

    public int getId() {
        return id;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String usuario) {
        this.nombreUsuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
