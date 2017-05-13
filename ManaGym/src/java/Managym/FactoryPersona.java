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

    public static Persona CrearPersona(int perfil, String usuario, String password, String documento) throws Exception {
        switch (perfil) {
            case 1:
                return new Cliente();
            case 2:
                return new Instructor();
            default:
                throw new Exception("Tipo de perfil no definido en el sistema");
        }
    }    
}
