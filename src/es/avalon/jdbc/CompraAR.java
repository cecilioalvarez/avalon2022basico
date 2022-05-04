package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class CompraAR {
    static final String URL = "jdbc:mysql://localhost:8889/cursos";
    static final String USUARIO="root";
    // opcoin clave =root
    static final String CLAVE="root";


    private int numero;
    private LocalDate fecha;
    private String concepto;
    private double importe;

    public CompraAR(int numero, LocalDate fecha, String concepto, double importe) {
        this.numero = numero;
        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
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
                    .executeUpdate("insert into Compras (numero,fecha,concepto,importe,personas_dni) values ('"+getNumero()+"','"+getFecha()+
                            "','"+getConcepto()+"',"+getImporte()+",'juan')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
