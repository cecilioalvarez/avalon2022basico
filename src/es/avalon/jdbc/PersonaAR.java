package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaAR {

    static final  String URL  = "jdbc:mysql://localhost:3306/cursosql4";
    static  final String USUARIO ="root";

    static  final  String CLAVE="";


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
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");

            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("insert into Personas (dni,nombre,edad) values ('"+getDni()+"','"+getNombre()+"',"+getEdad()+")");


        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
