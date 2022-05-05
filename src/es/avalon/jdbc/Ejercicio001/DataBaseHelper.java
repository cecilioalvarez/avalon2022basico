package es.avalon.jdbc.Ejercicio001;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseHelper {

    public static Connection getConexion() throws SQLException, IOException {

        //Creamos un metodo estatico que le un archivo de properties donde hemos guadado La url, usuario y contraseña
        //Tenemos esta funcion static que podemos reutilizar

        Properties propiedades = new Properties();
        propiedades.load(new FileReader("database.properties"));
        return DriverManager.getConnection(propiedades.getProperty("URL"), propiedades.getProperty("USUARIO"), propiedades.getProperty("CLAVE"));

    }
}
