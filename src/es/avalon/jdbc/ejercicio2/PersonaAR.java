package es.avalon.jdbc.ejercicio2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PersonaAR {

    static final String URL="jdbc:mysql://localhost:3306/cursosql";
    static final  String USUARIO="root";
    static final  String CLAVE="";
    private String Dni;
    private String nombre;
    private int edad;

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
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

    public PersonaAR(String dni, String nombre, int edad) {
        Dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void insertar(){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto se encarga de ejecutar una sentencia.
            Statement sentencia= con.createStatement();
            sentencia.executeUpdate("insert into Personas (dni,nombre,edad) values ('"+getDni()+"','"+getNombre()+"',"+getEdad()+")");



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("delete from personas where Dni='"+ getDni()+"'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(){
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("update personas set nombre='"+getNombre()+"',edad="+getEdad()+" where Dni='"+getDni()+"'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PersonaAR buscarUno(String dni){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("select * from personas where dni='"+dni+"'");
            rs.next();

                return new PersonaAR(rs.getString("dni"), rs.getString("nombre"),rs.getInt("edad"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<PersonaAR> buscarTodos(){
        List<PersonaAR> lista=new ArrayList<>();

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("select * from personas");
            while (rs.next()){

                lista.add(new PersonaAR(rs.getString("dni"),
                rs.getString("nombre"),rs.getInt("edad")));
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    }

