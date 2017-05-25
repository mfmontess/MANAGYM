/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.Perfil;
import Managym.Usuario;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author daniel
 */
public class UsuarioDAO extends Conexion {

    private static UsuarioDAO instance;
     Usuario u = null;

    public UsuarioDAO() {
        super();
    }

    public static UsuarioDAO getInstance() {
        if (null == instance) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    public Usuario Ingresar(String usuario, String contrasena) throws SQLException, Exception {

        Usuario u = null;
        
        conectar();
        String sql = "SELECT * FROM `usuarios` as `usuarios` WHERE usuarios.NombreUsuario = ? and usuarios.ContrasenaUsuario = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, contrasena);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            u = new Usuario(
                     rs.getString("NombreUsuario"),
                     rs.getString("ContrasenaUsuario"),
                    new Perfil(
                              rs.getInt("IdPerfil"),
                             rs.getString("NombrePerfil")
                    ),
                    rs.getInt("IdEstado")
                    );
        }
        
        
        
        cerrarConexion();
        return u;
    }
    
     public boolean InsetarUsuarios(Usuario U) throws SQLException, Exception {
        
        boolean bandera = false;       
        conectar();
        String sql = "INSERT INTO `managym`.`usuarios` (`IdUsuario`,"
                + " `NombreUsuario`,"
                + " `ContrasenaUsuario`,"
                + " `IdPerfil`,"
                + " `IdEstado`)"
                + "VALUES (?, ?, ?, 2 , 1 );";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, U.getId());
        ps.setString(2, U.getNombreUsuario());
        ps.setString(3, U.getContraseña());
       

        if (ps.executeUpdate() > 0) {

            bandera = true;
        }
        cerrarConexion();
        return bandera;
    }

    public void update(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
