package es.avalon.jdbc;

import java.sql.*;
import java.util.Scanner;

public class _05PrincipalInsercionConScanner {

    //Creamos url de conexion a la BBDD
    static final String DB_URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {

        try {

            //Creamos un objeto de Conexion
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);

            //Una vez estamos conectados pedimos datos
            Scanner sc = new Scanner(System.in);
            System.out.println("Vamos a insertar un nuevo dato");

            System.out.println("Indique el dni");
            String dni = sc.nextLine();

            System.out.println("Indique el nombre");
            String name = sc.nextLine();

            System.out.println("Indique la edad");
            int age = sc.nextInt();

            //Creamos un objeto sentencia para realizar una consulta
            Statement sentencia = con.createStatement();

            //Creamos una sentencia para insertar nuevos datos
            sentencia.executeUpdate("insert into Personas (dni, nombre, edad) values ('" + dni + "','" + name + "'," + age + ")");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
