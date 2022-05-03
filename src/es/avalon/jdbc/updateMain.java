package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateMain {

    static final String URL = "jdbc:mysql://localhost:3306/bd_personas";
    static final String USUARIO = "root";
    static final String CLAVE= "";

    public static void main(String[] args) {

        try{
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("UPDATE personas SET apellido='Fernandez' WHERE apellido='fdez'");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
