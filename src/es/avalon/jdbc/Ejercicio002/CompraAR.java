package es.avalon.jdbc.Ejercicio002;

import es.avalon.jdbc.PersonaAR;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompraAR {
    static final String URL = "jdbc:mysql://localhost:3306/cursosql1";//3306 es el puerto por el que conecta xampp a mysql
    static final String USUARIO = "root";//xampp simpre usa de USUARIO---- root
    static final String CLAVE = "";// La clave es un campo vacio en windows o "root" en mac.
    private int numero;
    private LocalDate fecha;
    private String concepto;
    private double importe;
    private String persona_dni;

    public CompraAR(LocalDate fecha, String concepto, double importe, String persona_dni) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.persona_dni = persona_dni;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getPersona_dni() {
        return persona_dni;
    }

    public void setPersona_dni(String persona_dni) {
        this.persona_dni = persona_dni;
    }

    public void insertar() {

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia
                    .executeUpdate("INSERT INTO `compras`(`fecha`, `concepto`, `importe`, `personas_dni`) VALUES ('"+getFecha()+"','"+getConcepto()+"','"+getImporte()+"','"+getPersona_dni()+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrar(){
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("DELETE FROM `compras` WHERE numero="+getNumero()+"");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
    public void actualizar(int numero){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            //el objeto statment se encarga de crear una sentencia
            Statement sentencia=con.createStatement();
            //el metodo executeUpdate se encarga de ejecutar la sentencia y actualiza la base de datos
            //con executeUpdate se puede modificar insertar y borrar.
            sentencia.executeUpdate("UPDATE `compras` SET ,`concepto`='"+getConcepto()+"',`importe`='"+getImporte()+"' WHERE numero="+numero+"");
            //ResultSet rs1 =sentencia.executeQuery("select * from facturas");



        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }
    public static CompraAR buscarUno(int numero){
        try{
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            Statement sentencia= con.createStatement();
            //necesitamos el rs.next() por que el resulse devuelve el anterios
            ResultSet rs=sentencia.executeQuery("select * from compras where numero="+numero+"");
            rs.next();
            return new CompraAR(rs.getDate("fecha").toLocalDate(), rs.getString("concepto"),rs.getDouble("importe"), rs.getString("personas_dni"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void todosLasCompras (){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia=con.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from compras");
            while (rs.next()){
                System.out.println(rs.getString("numero")+" "+rs.getString("concepto")+" "+rs.getString("importe")+" "+rs.getDate("fecha"));
                //System.out.println(rs1.getString("concepto"));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }

    }
    public static List<CompraAR> buscarTodos(){
        List<CompraAR>todos=new ArrayList<>();
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia=con.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from compras");
            while (rs.next()){
                todos.add(new CompraAR(rs.getDate("fecha").toLocalDate(), rs.getString("concepto"), rs.getDouble("importe"),rs.getString("personas_dni")) );
                //System.out.println(rs1.getString("concepto"));
            }return todos;


        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return null;

    }
}