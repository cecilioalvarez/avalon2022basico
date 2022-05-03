package es.avalon.jdbc;

import java.sql.*;

public class Principal {

    // jdbc:mysql://localhost:3306/biblioteca
    static final String URL = "jdbc:mysql://localhost:8889/cursos";
    static final String USUARIO="root";
    // opcoin clave =root
    static final String CLAVE="root";

    public static void main(String[] args) {


        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            ResultSet rs=sentencia.executeQuery("select * from Personas");
            while (rs.next()) {

                System.out.println(rs.getString("nombre"));
            }

        } catch (SQLException e) {
           e.printStackTrace();
        }


    }
}
