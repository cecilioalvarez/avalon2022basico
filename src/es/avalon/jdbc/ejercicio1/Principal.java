package es.avalon.jdbc.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {
    static final String URL="jdbc:mysql://localhost:3306/cursosql";
    static final  String USUARIO="root";
    static final  String CLAVE="";

    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            Scanner sc = new Scanner(System.in);

            System.out.println("Inserta un Dni");
            String Dni= sc.nextLine();

            System.out.println("Inserta un Nombre");
            String nombre = sc.nextLine();

            System.out.println("Inserta edad");
            int edad = sc.nextInt();

            Statement sentencia= con.createStatement();
            sentencia.executeUpdate("insert into personas(Dni,nombre,edad)" +  "values ('" + Dni+ "','"+ nombre+"',"+edad+ ")");



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
