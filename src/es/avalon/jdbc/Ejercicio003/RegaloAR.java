package es.avalon.jdbc.Ejercicio003;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegaloAR {

    private int numero;
    private String concepto;
    static final String URL="jdbc:mysql://localhost:3306/cursosql1";
    static final String USUARIO="root";
    static final String CLAVE="";

    public RegaloAR(int numero, String concepto) {
        this.numero = numero;
        this.concepto = concepto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void insertar(){
        try{
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Estamos conectados");
            Statement sentencia=con.createStatement();
            sentencia.executeUpdate("insert into regalos (numero,concepto) values ('"+getNumero()+"','"+getConcepto()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void borrar (int numero){
        try{
            Connection con=DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Estamos conectados");
            Statement sentencia=con.createStatement();
            sentencia.executeUpdate("delete from regalos where numero="+numero+"");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void modificarConcepto (int numero1, String conceptoNuevo){
        try{
            Connection con=DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Estamos conectados");
            Statement sentencia=con.createStatement();
            sentencia.executeUpdate("UPDATE `regalos` SET `concepto` = '"+conceptoNuevo+"' WHERE `regalos`.`numero` = '"+numero1+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static RegaloAR buscarRegalo (int numero){
        try{
            Connection con=DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("conexion ok");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("SELECT * FROM `regalos` WHERE numero="+numero+";");
            rs.next();
            return new RegaloAR(rs.getInt("numero"),rs.getString("concepto"));
        } catch (SQLException e) {
            e.printStackTrace();
        }return null;
    }
    public static List<RegaloAR> buscarTodo(){
        List<RegaloAR>regalos=new ArrayList<>();
        try{
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conexion ok");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("select * from regalos");
            while (rs.next()){
                regalos.add(new RegaloAR(rs.getInt("numero"),rs.getString("concepto")));
            }return regalos;


        } catch (SQLException e) {
            e.printStackTrace();
        }return null;
    }

    public static List<RegaloAR> buscarTodosPorNombre(String concepto2){
        List<RegaloAR>regalos=new ArrayList<>();
        try{
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conexion ok");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("select * from regalos");
            while (rs.next()){
                if (rs.getString("concepto").equals(concepto2))
                regalos.add(new RegaloAR(rs.getInt("numero"),rs.getString("concepto")));
            }return regalos;


        } catch (SQLException e) {
            e.printStackTrace();
        }return null;
    }
}
