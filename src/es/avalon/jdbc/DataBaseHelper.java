package es.avalon.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseHelper {

    //Creamos metodo de conexion y utilizaremos el objeto de esta clase para realizar la conexion
    public static Connection getConexion() throws SQLException, IOException {
        Properties properties = new Properties(); //Creamos un objeto de Propiedades
        properties.load(new FileReader("database.properties")); //Cargamos el archivo .properties donde tenemos almacenadas las variables de conexion

        return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("usuario"), properties.getProperty("clave"));
    }

}
