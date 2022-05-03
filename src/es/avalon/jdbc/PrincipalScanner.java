package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrincipalScanner {

    static final String URL = "jdbc:mysql://localhost:8889/solicitardatos";
    static final String USUARIO = "root";
    static final String CLAVE= "root";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);

            Scanner sc = new Scanner(System.in);
            System.out.println("ID");
            String dni = sc.nextLine();


            System.out.println("NOMBRE");
            String nombre = sc.nextLine();


            System.out.println("APELLIDO");
            String apellido = sc.nextLine();

            //El objeto statement se encarga de crear una sentencia
            Statement sentencia = con.createStatement();

            //El metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia.executeUpdate("INSERT INTO persona (id_persona, nombre, apellido)" +
                "VALUES ('" + dni + "', '" + nombre + "', " + apellido + " ) ");


        } catch (SQLException e){
            e.printStackTrace();
        }



    }
}
