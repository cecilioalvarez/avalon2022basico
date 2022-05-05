package es.avalon.jdbc.Ejercicio001;

import java.sql.*;

public class PrincipalInsertar {
    static final String URL = "jdbc:mysql://localhost:3306/cursosql";//3306 es el puerto por el que conecta xampp a mysql
    static final String USUARIO ="root";//xampp simpre usa de USUARIO---- root
                                        //opcion clave=root
    static final String CLAVE ="";// La clave es un campo vacio en windows o "root" en mac.

    public static void main(String[] args) {                                    //Esta es la forma de conectar la base de datos de mysql
        //Para ello debemos instalar unas librerias que son los drivers de conexion
        //Cada tipo de base de datos necesitara uns drivers (librerias) diferentes
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            //el objeto statment se encarga de crear una sentencia
            Statement sentencia=con.createStatement();
            //el metodo executeUpdate se encarga de ejecutar la sentencia y actualiza la base de datos
            //con executeUpdate se puede modificar insertar y borrar.
            sentencia.executeUpdate("delete from `personas` where DNI=100");//solo con indicar una de las colunmnas borra todas los campos

            //ResultSet rs1 =sentencia.executeQuery("select * from facturas");



        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }


    }
}
