
package Servicios;

import java.sql.*;
import java.util.ArrayList;



public class DBManager {
    private final String db = "managym";
    private final String url = "jdbc:mysql://181.48.135.254:3306/"+db;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "managym";
    private final String password = "managym";
    
    public DBManager(){
    }
    
    protected void addObject (ArrayList x,ResultSet rs){  
    }  
    protected ArrayList ejecutarQuery (String sz){
    ArrayList x= new ArrayList();
        try {
            Class.forName(driver);
            System.out.println("\nConectando a la Base de Managym....\n");
            Connection con= DriverManager.getConnection(url, usuario,password);
            if(con==null){
            System.out.println("\nNo esta conectado  la base\n");
            return x;
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sz);
            while(rs.next()){
                addObject (x,rs);
            }
            con.close();
        } catch (ClassNotFoundException e) {
        System.out.println("--------------------ERROR--------------------");
        System.out.println("SQL: "+sz);
        System.out.println("Exception :"+e);
        }catch(SQLException e){
        System.out.println("--------------------ERROR--------------------");
        System.out.println("SQL: "+sz);
       // JOptionPane.showMessageDialog(null, sz+"\n"+"VIOLA LA LLAVE DE UNICIDAD DEL CAMPO A AGREGAR, INTENTE NUEVAMENTE....");
        System.out.println("Exception :"+e);
        }
        return x;
    }
    
    protected void execute (String sz){
        try {
            Class.forName(driver);
            System.out.println("\nConectando a la Base de Managym....\n");
            Connection con= DriverManager.getConnection(url, usuario,password);
            if(con==null){
            System.out.println("\nNo esta conectado  la base\n");
            return ;
            }
          Statement stm = con.createStatement();
         stm.execute(sz);
         con.close();      
        } catch (ClassNotFoundException e) {
        System.out.println("--------------------ERROR--------------------");
        System.out.println("SQL: "+sz);
        System.out.println("Exception :"+e);
        }catch(SQLException e){
        System.out.println("--------------------ERROR--------------------");
        System.out.println("SQL: "+sz);
       // JOptionPane.showMessageDialog(null, sz+"\n"+"VIOLA LA LLAVE DE UNICIDAD DEL CAMPO A AGREGAR, INTENTE NUEVAMENTE....");
        System.out.println("Exception :"+e);
        }
        }
   
    }

