package es.avalon.jdbc.ejercicio02AR;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaAR {

       static final String URL = "jdbc:mysql://localhost:3306/cursomsql";
    static final String USUARIO = "root";
    //opcoin clave =root
    static final String CLAVE = "";

    private String dni;
    private String Nombre;
    private String Apellido;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public PersonaAR(String dni, String nombre, String apellido) {
        this.dni = dni;
        Nombre = nombre;
        Apellido = apellido;
    }

    public void insertar() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            // el metodo executequery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia.executeUpdate("insert into Personas (dni,nombre,apellido) values ('" + getDni() + "','" + getNombre() + "','" + getApellido() + "')");


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

        public void Delete() {
            try {
                Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("estamos conectados");
                // el objeto statement se encarga d crear un sentencia
                Statement sentencia = con.createStatement();
                // el metodo executequery se encarga de ejecutar la sentencia
                //este metodo devuelve un resultSET

                sentencia.executeUpdate("delete from personas where Dni='" + getDni() + "')");


            } catch (SQLException e) {
                e.printStackTrace();

            }
        }


    public void Update() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("update personas set nombre='" + getNombre() + "',apellido='" + getApellido() + "' where Dni='"+getDni()+"'");


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static PersonaAR buscaruno(String dni) {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            // el metodo executequery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            ResultSet rs = sentencia.executeQuery("select * from  personas where dni='" + dni + "'");
            rs.next();
            return new PersonaAR(rs.getString("dni"), rs.getString("nombre"),
                    rs.getString("apellido"));


        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

        public static List<PersonaAR> buscarTodos () {
            List<PersonaAR> lista = new ArrayList<>();
            try {
                Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("estamos conectados");
                // el objeto statement se encarga d crear un sentencia
                Statement sentencia = con.createStatement();
                // el metodo executequery se encarga de ejecutar la sentencia
                //este metodo devuelve un resultSET
                ResultSet rs = sentencia.executeQuery("select * from  personas ");
                while (rs.next()) {
                    lista.add(new PersonaAR(rs.getString("dni"), rs.getString("nombre"),
                            rs.getString("apellido")));
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
            return lista;

        }
    }


