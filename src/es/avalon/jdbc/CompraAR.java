package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class CompraAR {
    static final String URL = "jdbc:mysql://localhost:3306/cursos2";
    static final String USUARIO="root";
    // opcion clave =root
    static final String CLAVE="";


    private int numero;
    private LocalDate fecha;
    private String concepto;
    private double importe;
    private String dniPersona;

    public CompraAR( LocalDate fecha, String concepto, double importe,String dniPersona) {

        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.dniPersona=dniPersona;
    }

    public String getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(String dniPersona) {
        this.dniPersona = dniPersona;
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

    public void insertar() {

        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia
                    .executeUpdate("insert into compras (fecha,concepto,importe,dni_persona) values ('"+getFecha()+
                            "','"+getConcepto()+"',"+getImporte()+",'"+getDniPersona()+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}