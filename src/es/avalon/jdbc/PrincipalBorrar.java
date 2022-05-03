package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalBorrar {

    static final String URL = "jdbc:mysql://localhost:8889/cursos";
    static final String USUARIO="root";
    // opcoin clave =root
    static final String CLAVE="root";

    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET

            sentencia.executeUpdate("delete from Personas where dni='1'");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
