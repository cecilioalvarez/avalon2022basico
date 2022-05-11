package es.avalon.jdbc.ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalUpdate {
    static final String URL = "jdbc:mysql://localhost:3306/cursosql";
    static final String USUARIO = "root";
    static final String CLAVE = "";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("update personas set nombre='Manuel' where Dni='2'");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

