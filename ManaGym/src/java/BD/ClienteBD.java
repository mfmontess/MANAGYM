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
    
    public ClienteBD(){}
    public ArrayList getClientes(){
        ArrayList x = ejecutarQuery("select * from clientes");
        return x;
    }

    public void update(Cliente cliente) {
        execute( "update clientes"
                + "set nombreCliente = " + cliente.getNombreCliente()
                + "where  idCliente = " + cliente.getId()
        );
    }
}
