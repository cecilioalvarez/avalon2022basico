package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrincipalInsertarScaner {

    static final String URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO="root";
    // opcoin clave =root
    static final String CLAVE="";

    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);

            Scanner sc= new Scanner(System.in);
            System.out.println("dame el dni");
            String dni=sc.nextLine();

            System.out.println("dame el nombre");
            String nombre =sc.nextLine();
            System.out.println("dame el apellido");
            String apellido =sc.nextLine();
            System.out.println("dame la edad");
            int  edad=sc.nextInt();



            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia.executeUpdate("insert into Personas (dni,nombre,apellido,edad) values ('"+dni+"','"+nombre+"','"+apellido+"',"+edad+")");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}