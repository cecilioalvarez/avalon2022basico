package es.avalon.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompraAR {

    static final String DB_URL = "jdbc:mysql://localhost:3306/cursos";
    static final String USUARIO = "root";
    static final String PASSWORD = "";

    private int numero;
    private LocalDate fecha;
    private String concepto;
    private double importe;
    private int personas_dni;


    public CompraAR(LocalDate fecha, String concepto, double importe, int personas_dni) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.personas_dni = personas_dni;
    }

    public CompraAR(int numero, LocalDate fecha, String concepto, double importe, int personas_dni) {
        this.numero = numero;
        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.personas_dni = personas_dni;
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

    public int getPersonas_dni() {
        return personas_dni;
    }

    public void setPersonas_dni(int personas_dni) {
        this.personas_dni = personas_dni;
    }

    public void insertar() {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("insert into Compras (fecha, concepto, importe, personas_dni) values ('"+ getFecha() +"', '"+ getConcepto() + "',"+ getImporte()+","+ getPersonas_dni() +")");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void borrar(int numero) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("Delete from compras where numero = "+ numero +"");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(int numero, double importe) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);

            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("update Compras set concepto='"+ getConcepto() +"',importe = " + importe + " where numero="+ numero +"");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static CompraAR buscarUno(int numero){
        try {
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);

            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery("select * from compras where numero='"+ numero +"'");
            rs.next();
            return new CompraAR(rs.getDate("fecha").toLocalDate(),rs.getString("concepto"), rs.getDouble("importe"), rs.getInt("personas_dni"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<CompraAR> buscarTodos() {

        List<CompraAR> compras = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery("select * from compras");

            //Recorremos resultados y guardamos en lista
            while (rs.next()) {
                compras.add(new CompraAR(rs.getInt("numero"),rs.getDate("fecha").toLocalDate(),rs.getString("concepto"), rs.getDouble("importe"), rs.getInt("personas_dni")));
            }

            return compras;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
