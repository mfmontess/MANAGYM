package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
//sitewebs.cloudapp.net:3306
    protected String dominio = "181.48.135.254:3306";
    protected String base = "managym";
    protected String usuario = "managym";
    protected String contrasena = "managym2017";
    protected Connection conn;

    public void conectar() throws SQLException, Exception {

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://" + dominio + "/" + base, usuario, contrasena);
    }

    public void cerrarConexion() throws SQLException, Exception {
        if (null != conn) {
            conn.close();
        }
    }
}
