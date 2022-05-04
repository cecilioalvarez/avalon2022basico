package es.avalon.jdbc.Ejercicio001;

import java.sql.*;
import java.util.Scanner;

public class Principal {


    static final String URL = "jdbc:mysql://localhost:3306/cursosql";//3306 es el puerto por el que conecta xampp a mysql
    static final String USUARIO ="root";//xampp simpre usa de USUARIO---- root
    //opcion clave=root
    static final String CLAVE ="";// La clave es un campo vacio en windows o "root" en mac.

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String DNI;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca su DNI");
        DNI=sc.nextLine();
        System.out.println("Introduzca su Nombre");
        nombre=sc.nextLine();
        System.out.println("Introduzca su Apellido");
        apellido=sc.nextLine();
        //Esta es la forma de conectar la base de datos de mysql
        //Para ello debemos instalar unas librerias que son los drivers de conexion
        //Cada tipo de base de datos necesitara uns drivers (librerias) diferentes
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            //el objeto statment se encarga de crear una sentencia
            Statement sentencia=con.createStatement();

            //este metodo devuelve un resultSET
            sentencia.executeUpdate("INSERT INTO `personas`(`DNI`, `Nombre`, `Apellidos`) VALUES ('"+DNI+"','"+nombre+"','"+apellido+"')");





        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }


    }
}
