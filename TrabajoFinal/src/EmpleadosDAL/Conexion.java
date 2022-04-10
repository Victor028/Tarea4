
 
package EmpleadosDAL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Conexion {
    String strConnectionDB="jdbc:sqlite:C:/Users/Modem/Documents/aplicacion.s3db";
    Connection con = null;
    
    public  Conexion(){
        
     
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(strConnectionDB);
            System.out.print("Conexion establecida");
        } catch (Exception e) {
            System.out.print("Error " + e);
        }
       
    }
    
   public Connection conexion2 () {
        
        try {
            Class.forName("org.sqlite.JDBC");
            con = (Connection) DriverManager.getConnection(strConnectionDB);
             System.out.print("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
        return con;
    
    }
    
    public int ejecutarSenSql(String sqls){
        try {
            PreparedStatement pstm= con.prepareStatement(sqls);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.print(e);
            return 0;
        }
    }
    

  
    public ResultSet consultarRegistro(String sqls){
        try {
            PreparedStatement pstm= con.prepareStatement(sqls);
            ResultSet resp = pstm.executeQuery();
            return resp;
        } catch (SQLException e) {
            System.out.print(e);
            return null; 
        }
    }
}
