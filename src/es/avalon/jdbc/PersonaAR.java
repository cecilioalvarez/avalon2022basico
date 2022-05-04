package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//AR --> Active Record //Patron de diseño que simplifica la insercion de datos
public class PersonaAR {

    static final String DB_URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    static final String PASSWORD = "";

    private String dni;
    private String nombre;
    private int edad;

    public PersonaAR(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void insertar() {
        try {
            //Creamos un objeto de Conexion
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
            System.out.println("Estamos conectados");

            //Una vez estamos conectados

            //Creamos un objeto sentencia para realizar una consulta
            Statement sentencia = con.createStatement();

            //Creamos una sentencia para insertar nuevos datos
            sentencia.executeUpdate("insert into Personas (dni, nombre, edad) values ('"+ getDni()+"', '"+ getNombre() +"', "+ getEdad() +")");



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
