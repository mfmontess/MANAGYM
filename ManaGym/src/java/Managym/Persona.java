/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managym;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Persona {
    private Date fechaNacimiento;
    private String identificacion;
    private String nombre;
    private String celular;
    private String direccion;
    private Usuario usuario;
    
    public Persona(ResultSet rs){        
        try {
            identificacion = String.valueOf(rs.getInt("DocumentoPersona"));
            nombre = rs.getString("NombrePersona");
            celular = rs.getString("TelefonoPersona");
            direccion = rs.getString("DireccionPersona");
        } catch (Exception e) {
        }
    }
    
    public Persona(){}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
