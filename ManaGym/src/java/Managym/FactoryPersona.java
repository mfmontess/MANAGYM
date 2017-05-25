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
public class FactoryPersona {

    public static Persona CrearPersona(Usuario usuario) throws Exception {
        switch (usuario.getPerfil().getId()) {
            case 1:
                return new Cliente();
            case 2:
                return new Instructor();
            case 3:
                return new Administrador();
            default:
                throw new Exception("Tipo de perfil no definido en el sistema");
        }
    }    
}
