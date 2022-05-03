package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertScannerMain {

    static final String URL = "jdbc:mysql://localhost:3306/bd_personas";
    static final String USUARIO = "root";
    static final String CLAVE= "";

    public static void main(String[] args) {

        try{
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conectado a BBDD");
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame el dni");
            String dni = sc.nextLine();
            System.out.println("Dame el Nombre");
            String nombre = sc.nextLine();
            System.out.println("Dame el Apellido");
            String apellido = sc.nextLine();
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("INSERT INTO personas VALUES ('"+dni+"','"+nombre+"','"+apellido+"')");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
