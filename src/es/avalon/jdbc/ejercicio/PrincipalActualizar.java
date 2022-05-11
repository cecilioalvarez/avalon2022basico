package es.avalon.jdbc.ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalActualizar {
    static final String URL = "jdbc:mysql://localhost:3306/cursomsql";
    static final String USUARIO= "root";
    //opcoin clave =root
    static final String CLAVE="";


    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia.executeUpdate("update personas set nombre='jose' where dni='20220051'" );

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
