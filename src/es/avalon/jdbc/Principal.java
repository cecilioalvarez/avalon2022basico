package es.avalon.jdbc;

import java.sql.*;

public class Principal {
    static final  String URL  = "jdbc:mysql://localhost:3306/cursosql3";
    static  final String USUARIO ="root";

    static  final  String CLAVE="";

    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");

            Statement sentencia = con.createStatement();

            ResultSet rs=sentencia.executeQuery("select * from personas");
            while (rs.next()){
                System.out.println(rs.getString("nombre"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
