
package Conexion;

import java.sql.*;

public class Conexion {
    
    public static Connection conectar(){
        try {
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/base", "root", "");
            return cn;
            
        } catch (SQLException e) {
            System.err.println("error "+e);
        }
        return null;
    }
}
