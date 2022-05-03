package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrincipalDatosScanner {
    static final  String URL  = "jdbc:mysql://localhost:3306/cursosql3";
    static  final String USUARIO ="root";

    static  final  String CLAVE="";


    public static void main(String[] args) {


        try {

            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el Dni");
            String Dni= sc.nextLine();

            System.out.println("Inserte el nombre");
            String nombre= sc.nextLine();

            System.out.println("Inserte el apellido");
            String apellido= sc.nextLine();

            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("insert into personas (Dni, nombre, apellido) values ('"+Dni+"','"+nombre+"','"+apellido+"')");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
