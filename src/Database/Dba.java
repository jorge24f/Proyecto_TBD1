
package Database;

/**
 *
 * @author jflg2
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Dba {
    
    public Connection conexion;
    private String dbName;
    public Statement query;

    public Dba() {
    }
    
    public Dba(String dbName) {
        this.dbName = dbName;
    }
    
    public void conectar(){
        try{
            String url = "jdbc:sqlserver://JORGE_PC\\SQLEXPRESS;database=" + dbName + ";integratedSecurity=true;encrypt=false";
            conexion = DriverManager.getConnection(url);
            query = conexion.createStatement();
//            System.out.println("Connection succesfull!");
//            Statement stat = conexion.createStatement();
//            String query = "Select * from users";
//            ResultSet rs = stat.executeQuery(query);
//            
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
//            }
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void desconectar(){
        try{
            query.close();
            conexion.close();
        }catch (SQLException e){
        }
    } 
}  
