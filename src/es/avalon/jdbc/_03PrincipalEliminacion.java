package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _03PrincipalEliminacion {


    //Creamos url de conexion a la BBDD
    static final String DB_URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {

        try {

            //Creamos un objeto de Conexion
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
            System.out.println("Estamos conectados");

            //Una vez estamos conectados

            //Creamos un objeto sentencia para realizar una consulta
            Statement sentencia = con.createStatement();

            //Creamos una sentencia para borrar los datos
            sentencia.executeUpdate("Delete from Personas where dni = 3");


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
