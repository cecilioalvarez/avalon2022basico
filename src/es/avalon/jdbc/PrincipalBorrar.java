package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalBorrar {

    static final  String URL  = "jdbc:mysql://localhost:3306/cursosql3";
    static  final String USUARIO ="root";

    static  final  String CLAVE="";

    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");

            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("delete from personas\n" +
                    " where nombre='Edwin'");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
