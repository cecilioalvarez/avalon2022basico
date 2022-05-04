package jdbc.Crud;

import java.sql.*;

public class Principalnsertar {
    static final String DB_URL = "jdbc:mysql://localhost:3306/curspsqlavalon";
    static final String USUARIO="root";
    static final String CLAVE="";
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            System.out.println("conexion exitosa");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("insert into personas values ('3','andres','diaz',26)");


        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
}
}
