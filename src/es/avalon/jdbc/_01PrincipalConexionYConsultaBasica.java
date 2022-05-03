package es.avalon.jdbc;

import java.sql.*;

public class _01PrincipalConexionYConsultaBasica {


    //Creamos url de conexion a la BBDD
    static final String DB_URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {

        //Primero necesitamos instalar el Driver de conexion MYSQL y la libreria java (ConectorJDBC) que contiene todas las clases
        //que se encargan de gestionar el protocolo de comunicacion
        //Libreria para la conexion --> mysql:mysql-connector-java:8.0.27
        try {

            //Creamos un objeto de Conexion
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
            System.out.println("Estamos conectados");

            //Una vez estamos conectados

            //Creamos un objeto sentencia para realizar una consulta
            Statement sentencia = con.createStatement();

            //Guardamos el resultado de la consulta en un conjunto de datos de tipo ResultSet
            ResultSet rs = sentencia.executeQuery("select * from Personas");

            //Iteramos la devolucion e imprimimos los datos
            while (rs.next()) {
                System.out.println(rs.getString("Nombre"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
