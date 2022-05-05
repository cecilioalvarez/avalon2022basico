package es.avalon.jdbc.Ejercicio001;


import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PersonaAR2 {
    private String dni;
    private String nombre;
    private String apellido;

    public PersonaAR2(String dni, String nombre, String apellido) {
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

    //static final String URL = "jdbc:mysql://localhost:3306/cursosql";//3306 es el puerto por el que conecta xampp a mysql
    //static final String USUARIO = "root";//xampp simpre usa de USUARIO---- root
    //static final String CLAVE = "";// La clave es un campo vacio en windows o "root" en mac.

    private static Connection getConexion() throws SQLException, IOException {

        //Creamos un metodo estatico que le un archivo de properties donde hemos guadado La url, usuario y contraseña
        //Tenemos esta funcion static que podemos reutilizar

        Properties propiedades = new Properties();
        propiedades.load(new FileReader("database.properties"));
        return DriverManager.getConnection(propiedades.getProperty("URL"), propiedades.getProperty("USUARIO"), propiedades.getProperty("CLAVE"));

    }

    //Con este metodo no ganamos ninguna simplificacion.
    private static PreparedStatement getStatement(String sql, Connection con) throws SQLException {
        return con.prepareStatement(sql);
    }

    public void insertar() {
        try {
            Connection con = getConexion();
            //Esto es lo que llamamos una consulta parametrizada
            PreparedStatement sentencia = con.prepareStatement("insert into personas (DNI,Nombre,Apellidos) values (?,?,?)");
            sentencia.setString(1, getDni());
            sentencia.setString(2, getNombre());
            sentencia.setString(3, getApellido());
            sentencia.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void borrar() {
        try {
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("DELETE FROM `personas` WHERE dni=?");
            sentencia.setString(1, getDni());
            sentencia.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actualizar() {
        try {
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("update personas set nombre=?,apellidos=? where DNI=?");
            sentencia.setString(1, getNombre());
            sentencia.setString(2, getApellido());
            sentencia.setString(3, getDni());
            sentencia.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PersonaAR2 buscarUno(String dni) {
        try {
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("select * from personas where dni=?");
            sentencia.setString(1, dni);
            ResultSet rs = sentencia.executeQuery();
            rs.next();
            return new PersonaAR2(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"));

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void todosLasPersonas() {
        try {
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("select * from Personas");
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellidos") + " " + rs.getString("dni"));
                //System.out.println(rs1.getString("concepto"));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<PersonaAR2> buscarTodos() {
        List<PersonaAR2> todos = new ArrayList<>();
        try {
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("select * from Personas");
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                todos.add(new PersonaAR2(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos")));
                //System.out.println(rs1.getString("concepto"));
            }
            return todos;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
