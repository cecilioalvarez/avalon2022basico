package es.avalon.jdbc;

import java.sql.*;

public class PrincipalInsertar {

    static final String URL = "jdbc:mysql://localhost:8889/solicitardatos";
    static final String USUARIO = "root";
    static final String CLAVE= "root";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conectado");

            //El objeto statement se encarga de crear una sentencia
            Statement sentencia = con.createStatement();

            //El metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia.executeUpdate("INSERT INTO persona (id_persona, nombre, apellido) VALUES ('1015428663', 'Felipe', 'Miranda')");


        } catch (SQLException e){
            e.printStackTrace();
        }



    }
}
