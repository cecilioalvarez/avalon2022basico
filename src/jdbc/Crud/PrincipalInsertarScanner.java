package jdbc.Crud;

import java.sql.*;
import java.util.Scanner;

public class PrincipalInsertarScanner {

    static final String DB_URL = "jdbc:mysql://localhost:3306/curspsqlavalon";
    static final String USUARIO="root";
    static final String CLAVE="";
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            System.out.println("conexion exitosa");
           // Statement sentencia = con.createStatement();

            String dni="";
            String nombre="";
            String apellido="";
            int edad;
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese dni");
            dni=sc.nextLine();
            System.out.println("ingrese nombre");
            nombre=sc.nextLine();
            System.out.println("ingrese apellido");
            apellido=sc.nextLine();
            System.out.println("ingrese edad");
            edad=sc.nextInt();
            //sentencia.executeUpdate("insert into personas values ('"+dni+"','"+nombre+"','"+apellido+"',"+edad+")");
            PreparedStatement sentenciaPre = con.prepareStatement("insert into personas values (?,?,?,?)");
            sentenciaPre.setString(1,dni);
            sentenciaPre.setString(2,nombre);
            sentenciaPre.setString(3,apellido);
            sentenciaPre.setInt(4,edad);
            sentenciaPre.executeUpdate();

        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }
}
