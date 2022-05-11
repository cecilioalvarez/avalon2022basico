package es.avalon.jdbc.ejercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

    static final String URL = "jdbc:mysql://localhost:3306/cursomsql";
    static final String USUARIO= "root";
    //opcoin clave =root
    static final String CLAVE="";

    public static void main(String[] args) {



        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            Scanner scanner = new Scanner(System.in);

            System.out.println("introduce Dni");
            String  Dni =  scanner.nextLine();
            System.out.println("introduce nombre");
            String nombre = scanner.nextLine();
            System.out.println("introduce apellido");
            String apellido = scanner.nextLine();


            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("insert into personas (Dni,nombre,apellido)" + "value ('"+Dni+"','"+nombre+"','"+apellido+"')");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }



}

