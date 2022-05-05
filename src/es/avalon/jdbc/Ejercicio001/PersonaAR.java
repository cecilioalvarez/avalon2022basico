package es.avalon.jdbc.Ejercicio001;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaAR {
    private String dni;
    private String nombre;
    private String apellido;

    public PersonaAR(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    static final String URL = "jdbc:mysql://localhost:3306/cursosql";//3306 es el puerto por el que conecta xampp a mysql
    static final String USUARIO = "root";//xampp simpre usa de USUARIO---- root
    static final String CLAVE = "";// La clave es un campo vacio en windows o "root" en mac.

    public void insertar() {
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("INSERT INTO `personas`(`DNI`, `Nombre`, `Apellidos`) VALUES ('"+getDni()+"','"+getNombre()+"','"+getApellido()+"')");

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }
    public void borrar(){
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("DELETE FROM `personas` WHERE dni='"+getDni()+"'");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
    public void actualizar(){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            //el objeto statment se encarga de crear una sentencia
            Statement sentencia=con.createStatement();
            //el metodo executeUpdate se encarga de ejecutar la sentencia y actualiza la base de datos
            //con executeUpdate se puede modificar insertar y borrar.
            sentencia.executeUpdate("update personas set nombre='"+getNombre()+"' where DNI='"+getDni()+"'");
            //ResultSet rs1 =sentencia.executeQuery("select * from facturas");



        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }
    public static PersonaAR buscarUno(String dni){
        try{
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            Statement sentencia= con.createStatement();
            //necesitamos el rs.next() por que el resulse devuelve el anterios
            ResultSet rs=sentencia.executeQuery("select * from personas where dni='"+dni+"'");
            rs.next();
            return new PersonaAR(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos") );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void todosLasPersonas (){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia=con.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from Personas");
            while (rs.next()){
                System.out.println(rs.getString("nombre")+" "+rs.getString("apellidos")+" "+rs.getString("dni"));
                //System.out.println(rs1.getString("concepto"));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }

    }
    public static List<PersonaAR> buscarTodos(){
        List<PersonaAR>todos=new ArrayList<>();
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia=con.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from Personas");
            while (rs.next()){
                todos.add(new PersonaAR(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos") ));
                //System.out.println(rs1.getString("concepto"));
            }return todos;


        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return null;

    }
}
