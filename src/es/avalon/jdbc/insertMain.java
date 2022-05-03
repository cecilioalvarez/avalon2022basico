package es.avalon.jdbc;

import java.sql.*;

public class insertMain {

    static final String URL = "jdbc:mysql://localhost:3306/bd_personas";
    static final String USUARIO = "root";
    static final String CLAVE= "";

    public static void main(String[] args) {

        try{
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("INSERT INTO personas VALUES ('80000000C','Margarito','Boxeador')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
