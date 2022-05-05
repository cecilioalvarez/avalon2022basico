package es.avalon.jdbc.Ejercicio001;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalBorrar {
    static final String URL = "jdbc:mysql://localhost:3306/cursosql";//3306 es el puerto por el que conecta xampp a mysql
    static final String USUARIO ="root";//xampp simpre usa de USUARIO---- root
    //opcion clave=root
    static final String CLAVE ="";// La clave es un campo vacio en windows o "root" en mac.

    public static void main(String[] args) {
        try{
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conexion ok");
            Statement sentencia= con.createStatement();
            sentencia.executeUpdate("delete from personas where dni='123'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
