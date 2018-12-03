package DAOs;
import java.sql.*;
public class Conexion {

    private static Connection CONEXION = null;

    public static Connection getConnection() throws SQLException {
        if (CONEXION == null) {
            try {

                String Username = "root";
                String password = "";
                String Host = "localhost";
                String Port = "3306";
                String Database = "ATGlimitada";
                String CLASSNAME = "com.mysql.jdbc.Driver";
                String URL = "jdbc:mysql://" + Host + ":" + Port + "/" + Database;

                Class.forName(CLASSNAME).newInstance();
                //Integracion Log4J
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            } catch (InstantiationException e) {
                //Integracion Log4J
                throw new SQLException(e);
            } catch (IllegalAccessException e) {
                //Integracion Log4J
                throw new SQLException(e);
            }

            try {
                CONEXION = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ejemplo", "root", "");
                // aqui se contecta
            } catch (SQLException e) {
                throw new SQLException(e);
            }

        }
        return CONEXION;
    }

    public static void closeConnection() throws SQLException {
        try {
            if (CONEXION != null) {
                CONEXION.close();
                CONEXION = null;
            }

        } catch (SQLException e) {
            //Integracion Log4J
            throw new SQLException(e);
        }

    }

}
