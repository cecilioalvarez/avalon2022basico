package es.avalon.jdbc;

import java.sql.*;
import java.util.Scanner;

public class PersonaAR {

    static final String URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    //opcion clave = root
    static final String CLAVE = "";

    private String id;
    private String nombre;
    private int edad;

    public PersonaAR(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void insertar () {
        try {
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);

//            System.out.println("Introduzca los datos del registro:");
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("DNI:");
//            String dni = sc.nextLine();
//
//            System.out.println("Nombre");
//            String name = sc.nextLine();
//
//            System.out.println("Edad");
//            int edad = sc.nextInt();

            Statement sentencia = con.createStatement();
            sentencia.executeUpdate
                    ("insert into personas (dni,nombre,edad) values ('"+getId()+"','"+getNombre()+"','"+getEdad()+"')");

            ResultSet rs = sentencia.executeQuery("select * from personas");

            while (rs.next()) {
                System.out.println(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void borrar () {
        try {
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);

//            System.out.println("Introduzca los datos del registro:");
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("DNI:");
//            String dni = sc.nextLine();
//
//            System.out.println("Nombre");
//            String name = sc.nextLine();
//
//            System.out.println("Edad");
//            int edad = sc.nextInt();

            Statement sentencia = con.createStatement();
            sentencia.executeUpdate
                    ("delete from personas where values='"+getId()+"';");

            ResultSet rs = sentencia.executeQuery("select * from personas");

            while (rs.next()) {
                System.out.println(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
