package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteMain {

    static final String URL = "jdbc:mysql://localhost:3306/bd_personas";
    static final String USUARIO = "root";
    static final String CLAVE= "";

    public static void main(String[] args) {

        try{
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("DELETE From personas WHERE personas.dni='80000000C'");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
