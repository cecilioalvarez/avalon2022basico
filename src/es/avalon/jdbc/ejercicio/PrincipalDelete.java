package es.avalon.jdbc.ejercicio;
import java.sql.*;

public class PrincipalDelete {

    static final String URL = "jdbc:mysql://localhost:3306/cursosql";
    static final String USUARIO = "root";
    static final String CLAVE = "";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("delete from personas where Dni='1'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}