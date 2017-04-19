
package Managym;

import java.util.ArrayList;

public class Administrador {

    private int IdAdministrador;
    private String NombreAdministrador;
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Maquina> maquinas;        
    
    public Administrador(){
   clientes = new ArrayList();
   instructores = new ArrayList();
   maquinas = new ArrayList();
   }
    public Administrador(int IdAdministrador, String NombreAdministrador, ArrayList<Cliente> clientes, ArrayList<Instructor> instructores, ArrayList<Maquina> maquinas) {
        this.IdAdministrador = IdAdministrador;
        this.NombreAdministrador = NombreAdministrador;
        this.clientes = clientes;
        this.instructores = instructores;
        this.maquinas = maquinas;
    }

    public int getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(int IdAdministrador) {
        this.IdAdministrador = IdAdministrador;
    }

    public String getNombreAdministrador() {
        return NombreAdministrador;
    }

    public void setNombreAdministrador(String NombreAdministrador) {
        this.NombreAdministrador = NombreAdministrador;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Instructor> getInstructores() {
        return instructores;
    }

    public void setInstructores(ArrayList<Instructor> instructores) {
        this.instructores = instructores;
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }
  
    @Override
    public String toString() {
       return "\n"+IdAdministrador+"\n"+NombreAdministrador;
    }
    
}
