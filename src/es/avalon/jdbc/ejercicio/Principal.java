package es.avalon.jdbc.ejercicio;

import java.sql.*;

public class Principal {
    static final String URL = "jdbc:mysql://localhost:3306/cursomsql";
    static final String USUARIO= "root";
    //opcoin clave =root
    static final String CLAVE="";

    public static void main(String[] args) {

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de e


            ResultSet rs=sentencia.executeQuery("select * from personas");
            while (rs.next()) {

                System.out.println(rs.getString("nombre"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
