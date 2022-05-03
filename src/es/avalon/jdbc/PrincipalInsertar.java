package es.avalon.jdbc;

import java.sql.*;

public class PrincipalInsertar {
    static final  String URL  = "jdbc:mysql://localhost:3306/cursosql3";
    static  final String USUARIO ="root";

    static  final  String CLAVE="";

    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");

            Statement sentencia = con.createStatement();

           sentencia.executeUpdate("insert into personas (Dni, nombre, apellido) values ('3', 'crsitian','ramires')");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
