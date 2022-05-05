package jdbc.AR;

import java.sql.*;
import java.util.ArrayList;

public class personaAddRecord {
    private String dni;
    private String Nombre;
    private String Apellido;

    static final String DB_URL = "jdbc:mysql://localhost:3306/pedidos";
    static final String USUARIO="root";
    static final String CLAVE="";
   private  Connection con;

    public personaAddRecord() {
    }

    public personaAddRecord(String dni, String nombre, String apellido) {
        try {
            con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.dni = dni;
        Nombre = nombre;
        Apellido = apellido;
    }

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

    public void insertar(){
        try {

            PreparedStatement sentenciaPre = con.prepareStatement("insert into personas values (?,?,?)");
            sentenciaPre.setString(1,getDni());
            sentenciaPre.setString(2,getNombre());
            sentenciaPre.setString(3,getApellido());
            sentenciaPre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }

    public  personaAddRecord buscaruno(String dni){
        try {
        Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            PreparedStatement sentenciaPre = con.prepareStatement("select * from personas where dni= ?");
            sentenciaPre.setString(1,dni);
            ResultSet rs = sentenciaPre.executeQuery();
            rs.next();
            return (new personaAddRecord(rs.getString("dni"),rs.getString("nombre"),rs.getString("apellido")));
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
        return null;
    }


    public ArrayList<personaAddRecord> buscarTodos(){
        ArrayList<personaAddRecord> lasPerosnas = new ArrayList<personaAddRecord>();
        try {
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            PreparedStatement sentenciaPre = con.prepareStatement("select * from personas");
            ResultSet rs = sentenciaPre.executeQuery();
            while (rs.next()){
                lasPerosnas.add(new personaAddRecord(rs.getString("dni"),rs.getString("nombre"),rs.getString("apellido")));

            }
              } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
        return lasPerosnas;
    }

    public ArrayList<personaAddRecord> buscarTodosPorNombr(String Nombre){
        ArrayList<personaAddRecord> lasPerosnas = new ArrayList<personaAddRecord>();
        try {
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            PreparedStatement sentenciaPre = con.prepareStatement("select * from personas WHERE nombre =?");
            sentenciaPre.setString(1,Nombre);
            ResultSet rs = sentenciaPre.executeQuery();
            while (rs.next()){
                lasPerosnas.add(new personaAddRecord(rs.getString("dni"),rs.getString("nombre"),rs.getString("apellido")));

            }
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
        return lasPerosnas;
    }

    public void modificar(){
        try {

            PreparedStatement sentenciaPre = con.prepareStatement("UPDATE `personas` SET `nombre`=?,`apellido`=? WHERE Dni=?");
            sentenciaPre.setString(1,getNombre());
            sentenciaPre.setString(2,getApellido());
            sentenciaPre.setString(3,getDni());
            sentenciaPre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }

    public void borrar(){
        try {
            PreparedStatement sentenciaPre = con.prepareStatement("DELETE FROM `personas` WHERE dni = ?");
            sentenciaPre.setString(1,getDni());
            sentenciaPre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }
}
