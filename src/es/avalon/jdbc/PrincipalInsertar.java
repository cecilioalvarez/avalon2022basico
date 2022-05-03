package es.avalon.jdbc;

import java.sql.*;

public class PrincipalInsertar {

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
            sentencia.executeUpdate("insert into Personas (dni,nombre,edad) values ('3','antonio',50)");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
