package es.avalon.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaAR {

    private String dni;
    private String nombre;
    private String apellido;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public PersonaAR(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    static final String URL = "jdbc:mysql://localhost:3306/bd_personas";
    static final String USUARIO = "root";
    static final String CLAVE = "";

    public void insertar() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("INSERT INTO personas (dni,nombre,apellido) VALUES ('" + getDni() + "','" + getNombre() + "','" + getApellido() + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrar() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("DELETE FROM personas WHERE Dni=" + getDni());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static PersonaAR buscar(String dni) {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM personas WHERE Dni='" + dni + "'");
            rs.next();
            return new PersonaAR(rs.getString("dni"), rs.getString("Nombre"), rs.getString("Apellido"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<PersonaAR> buscarTodo() {
        List<PersonaAR> lista = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM personas");
            while (rs.next()){
                lista.add(new PersonaAR(rs.getString("dni"), rs.getString("Nombre"), rs.getString("Apellido")));
            }
        return lista;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
