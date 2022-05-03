package es.avalon.jdbc;

import java.sql.*;

public class MainInsertar {

    static final String URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    //opcion clave = root
    static final String CLAVE = "";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Estamos conectados");
            //el objeto "Statement se encarga de crear una sentencia
            Statement sentencia = con.createStatement();

            //Para actualizar la base de datos utilizamos "VariableSentencia.executeUpdate"
            sentencia.executeUpdate("delete from personas where dni='3'");

            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            //Se utiliza para realizar las consultas en la base de datos
            ResultSet rs = sentencia.executeQuery("select * from personas");

            while (rs.next()) {
                System.out.println(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

