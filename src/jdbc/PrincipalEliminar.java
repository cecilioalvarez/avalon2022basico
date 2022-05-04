package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalEliminar {
    static final String DB_URL = "jdbc:mysql://localhost:3306/curspsqlavalon";
    static final String USUARIO="root";
    static final String CLAVE="";
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            System.out.println("conexion exitosa");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("DELETE FROM `personas` WHERE dni ='3'");


        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }
}
