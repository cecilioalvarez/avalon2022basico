package es.avalon.jdbc.ejercicio03ARCompras;

import es.avalon.jdbc.ejercicio02AR.PersonaAR;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompraAr {
    static final String URL = "jdbc:mysql://localhost:3306/curso_ejercicio4";
    static final String USUARIO = "root";
    //opcoin clave =root
    static final String CLAVE = "";

    private int numero;
    private String concepto;
    private double importe;
    private LocalDate fecha;
    private String personas_dni;

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

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPersonas_dni() {
        return personas_dni;
    }

    public void setPersonas_dni(String personas_dni) {
        this.personas_dni = personas_dni;
    }

    public CompraAr(int numero) {
        this.numero = numero;
    }



    public CompraAr(int numero, String concepto, double importe, LocalDate fecha, String personas_dni) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
        this.fecha = fecha;
        this.personas_dni = personas_dni;
    }

    public void insertar() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            // el metodo executequery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia.executeUpdate("INSERT INTO compras (fecha,numero,concepto,importe,personas_dni) VALUES ('"+getFecha()+"','" + getNumero() +
                    "','" + getConcepto() + "','" + getImporte() + "','" + getPersonas_dni() + "')");

        } catch (SQLException e) {
            e.printStackTrace();

        }


    }
    public void Delete() {
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            // el metodo executequery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET

            sentencia.executeUpdate("delete from compras where numero='" + getNumero());


        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

    public void Update() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("update compras set fecha='" + getFecha() + "',personas_dni='" + getPersonas_dni() + "',importe='" + getImporte() + "',concepto='" + getConcepto() + "' where numero='"+getNumero()+"'");


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static CompraAr buscarUno(int numero) {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            // el metodo executequery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            ResultSet rs = sentencia.executeQuery("select * from  compras where numero='" + numero + "'");
            rs.next();
            return (new CompraAr(rs.getInt("numero"), rs.getString("concepto"), rs.getDouble("importe"),
                    rs.getDate("fecha").toLocalDate(), rs.getString("personas_dni")));

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public static List<CompraAr> buscarTodos () {
        List<CompraAr> lista = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga d crear un sentencia
            Statement sentencia = con.createStatement();
            // el metodo executequery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            ResultSet rs = sentencia.executeQuery("select * from compras ");
            while (rs.next()) {
                lista.add(new CompraAr(rs.getInt("numero"), rs.getString("concepto"), rs.getDouble("importe"),
                        rs.getDate("fecha").toLocalDate(), rs.getString("personas_dni")));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;

    }




}

