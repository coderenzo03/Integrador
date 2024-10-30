
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:33065/farmcia_proy"; // Cambia a tu base de datos
    private static final String USER = "root"; // Cambia al usuario de tu BD
    private static final String PASSWORD = "root"; // Cambia a la contraseña de tu BD

    public static Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public Connection Conexion() {
  
        return null;
  
    }
}