package jdbc;

import java.sql.*;

public class Principal {
  static final String DB_URL = "jdbc:mysql://localhost:3306/curspsqlavalon";
  //  static final String DB_URL = "jdbc:mysql://localhost:3306/colegio";
    static final String USUARIO="root";
    static final String CLAVE="";
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            System.out.println("conexion exitosa");
            Statement sentencia = con.createStatement();
            ResultSet rs=sentencia.executeQuery("select * from personas");
            while (rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }
}
