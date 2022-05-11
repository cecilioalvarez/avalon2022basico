package es.avalon.jdbc.ejercicio;

import java.sql.*;

public class Principal {

    // conexion base de datos desde phpmyadmin, se coloca el puerto mysql de xampp y nombre de la base datos.
    static final String URL="jdbc:mysql://localhost:3306/cursosql";
    //usuario phpmyadmin por defecto es root
    static final  String USUARIO="root";
    //clave phpmyadmin
    static final  String CLAVE="";

    public static void main(String[] args) {

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("select * from personas");
            while (rs.next()){

                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
