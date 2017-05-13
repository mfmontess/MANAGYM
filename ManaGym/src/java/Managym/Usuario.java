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
    private String usuario;
    private String contraseña;
    private Perfil perfil;
    private int estado;
    
    

    public Usuario() {
    }

    public Usuario(int id,  String usuario, String contraseña, Perfil perfil, int estado) {
        this.id = id;      
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.perfil = perfil;
        this.estado = estado;
    }
    
    public Usuario(ResultSet rs){        
        try {
            id = rs.getInt("IdUsuario");
            usuario = rs.getString("NombreUsuario");
            contraseña = rs.getString("ContrasenaUsuario");            
            perfil = new Perfil(rs.getInt("IdPerfil"),rs.getString("NombrePerfil"));
            estado = rs.getInt("IdEstado");
        } catch (Exception e) {
        }
    }

    public Usuario(String usuario, String password, Perfil perfil) {
        this.usuario = usuario;
        this.contraseña = password;
        this.perfil = perfil;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    

  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
