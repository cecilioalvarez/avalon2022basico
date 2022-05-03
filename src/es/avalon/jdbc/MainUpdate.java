package es.avalon.jdbc;

import java.sql.*;
import java.util.Scanner;

public class MainUpdate {

    static final String URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    //opcion clave = root
    static final String CLAVE = "";

    public static void main(String[] args) {



        try {
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);

            System.out.println("Introduzca los datos del registro:");
            Scanner sc = new Scanner(System.in);

            System.out.println("DNI:");
            String dni = sc.nextLine();

            System.out.println("Nombre");
            String name = sc.nextLine();

            System.out.println("Edad");
            int edad = sc.nextInt();
            //el objeto "Statement se encarga de crear una sentencia
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate
                    ("insert into personas (dni,nombre,edad) values ('"+dni+"','"+name+"','"+edad+"')");
            //sentencia.executeUpdate("update personas set nombre='miguel' where dni ='1'");
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            ResultSet rs = sentencia.executeQuery("select * from personas");

            while (rs.next()) {
                System.out.println(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

