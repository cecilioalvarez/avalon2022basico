package es.avalon.jdbc.ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalIsentar {
    static final String URL="jdbc:mysql://localhost:3306/cursosql";
    static final  String USUARIO="root";
    static final  String CLAVE="";
    public static void main(String[] args) {

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia= con.createStatement();
            sentencia.executeUpdate("insert into personas(Dni,nombre,edad) values('5','Antonio',45)");
            sentencia.executeUpdate("insert into personas(Dni,nombre,edad) values('6','Nerys',28)");
            sentencia.executeUpdate("insert into personas(Dni,nombre,edad) values('7','Manuel',50)");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
