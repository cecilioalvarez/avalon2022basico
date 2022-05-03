package es.avalon.jdbc;

import java.sql.*;

public class _02PrincipalInserccion {


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

            //Creamos una sentencia para insertar nuevos datos
            sentencia.executeUpdate("insert into Personas (dni, nombre, edad) values ('3', 'Antonio', 50)");


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
