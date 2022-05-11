package es.avalon.jdbc.ejercicio04;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseHelper {
    public static Connection getConexion() throws SQLException, IOException {

        Properties propiedades= new Properties();
        propiedades.load(new FileReader("database.properties"));
        return DriverManager.getConnection(propiedades.getProperty("url"),propiedades.getProperty("usuario"),propiedades.getProperty("clave"));

    }
}