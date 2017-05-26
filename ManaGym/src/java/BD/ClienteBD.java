/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.Cliente;
import Servicios.DBManager;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ClienteBD extends DBManager {
    
    private ClienteBD(){}
    public static ClienteBD mgr = new ClienteBD();
    public ArrayList getClientes(){
        ArrayList x = ejecutarQuery("select * from clientes");
        return x;
    }

    public void update(Cliente cliente) {
        execute( "update clientes"
                + "set nombreCliente = " + cliente.getNombre()
                + "where  idCliente = " + cliente.getId()
        );
    }

    public void insert(Cliente cliente) {
        execute("INSERT INTO Instructores (IdUsuario,CedulaCliente,NombreCliente,TelefonoCliente,DireccionCliente) VALUES ("
                + cliente.getUsuario().getId() +"," + Integer.parseInt(cliente.getIdentificacion()) + ",'" + cliente.getNombre() + "','" + cliente.getCelular() +"','"+ cliente.getDireccion() +"')");
    }

    public void updateInstructor(String cliente, int idInstructor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
