package es.avalon.jdbc;

import java.sql.*;

public class PersonaAR {

    static final String URL = "jdbc:mysql://localhost:8889/cursos";
    static final String USUARIO="root";
    // opcoin clave =root
    static final String CLAVE="root";

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
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia
                    .executeUpdate("insert into Personas (dni,nombre,edad) values ('"+getDni()+"','"+getNombre()+"',"+getEdad()+")");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrar() {

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET

            sentencia.executeUpdate("delete from Personas where dni='"+getDni()+"'");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void actualizar() {
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia.executeUpdate("update Personas set nombre='"+getNombre()+"' ,edad="+getEdad()+" where dni='"+getDni()+"'" );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PersonaAR buscarUno(String dni) {

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            ResultSet rs=sentencia.executeQuery("select * from Personas  where dni='"+dni+"'" );
            rs.next();
            return new PersonaAR(rs.getString("dni"),
                    rs.getString("nombre"),rs.getInt("edad"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
