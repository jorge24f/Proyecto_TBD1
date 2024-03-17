
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
    
    private String host = "database-1.cr2kg4gcqs0x.us-east-1.rds.amazonaws.com"; // endpoint
    private String dbName2 = "base_1";
    private String userName = "admin";
    private String userPass = "admin123";
    private String port = "1433";

    public Dba() {
    }
    
    public Dba(String dbName) {
        this.dbName = dbName;
    }
    
    public void conectar() {
        try{
            //String url = "jdbc:sqlserver://JORGE_PC\\SQLEXPRESS;database=" + dbName + ";integratedSecurity=true;encrypt=false";
            String url = "jdbc:sqlserver://" + this.host + ":" + this.port + 
                            ";databaseName=" + this.dbName2 + 
                            ";user=admin;password=admin123;encrypt=true;trustServerCertificate=true;loginTimeout=30";
            conexion = DriverManager.getConnection(url);
            query = conexion.createStatement();
            //System.out.println("Connection succesfull!");
        }catch (Exception e){
            System.out.println("Error");
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
