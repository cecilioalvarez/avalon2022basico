package es.avalon.jdbc;

import java.sql.*;

public class bbd_main {

    static final String URL = "jdbc:mysql://localhost:3306/bd_personas";
    static final String USUARIO = "root";
    static final String CLAVE= "";

    public static void main(String[] args) {

        try{
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            ResultSet rs= sentencia.executeQuery("SELECT * FROM personas");
            while(rs.next())
            System.out.println(rs.getString("dni"));

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
