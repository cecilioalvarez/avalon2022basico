package jdbc.AR;

import java.sql.*;

public class PrincipalAddRecord {
    private String dni;
    private String Nombre;
    private String Apellido;

    static final String DB_URL = "jdbc:mysql://localhost:3306/pedidos";
    static final String USUARIO="root";
    static final String CLAVE="";

    public PrincipalAddRecord(String dni, String nombre, String apellido) {
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
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
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
}
