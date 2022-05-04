package es.avalon.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompraAR {

    private int id;
    private LocalDate fecha;
    private String concepto;
    private Float importe;
    private String persona_dni;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public String getPersona_dni() {
        return persona_dni;
    }

    public void setPersona_dni(String persona_dni) {
        this.persona_dni = persona_dni;
    }

    public CompraAR(LocalDate fecha, String concepto, Float importe, String persona_dni) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.persona_dni = persona_dni;
    }

    public CompraAR(int id) {
        this.id = id;
    }

    public CompraAR(int id,LocalDate fecha, String concepto, Float importe, String persona_dni) {
        this.id = id;
        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.persona_dni = persona_dni;
    }

    static final String URL = "jdbc:mysql://localhost:3306/supermercado";
    static final String USUARIO = "root";
    static final String CLAVE = "";

    public void insertar() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("INSERT INTO compra (Fecha,Concepto,Importe,Persona_dni) VALUES ('" + getFecha() +
                    "','" + getConcepto() + "','"+getImporte()+"','"+getPersona_dni()+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrar() {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("DELETE FROM compra WHERE id=" + getId());


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void actualizar() {
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("UPDATE compra SET Fecha='"+getFecha()+"', Concepto='"+getConcepto()+"', Importe='"+getImporte()+"', Persona_dni='"+getPersona_dni()+
                    "' WHERE id='"+getId()+"'");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

   public static CompraAR buscarUno(int id) {

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conectado a BBDD");
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM compra WHERE id='" + id + "'");
            rs.next();
            return new CompraAR(rs.getInt("id"), rs.getDate("Fecha").toLocalDate(), rs.getString("Concepto"), rs.getFloat("Importe"),
                    rs.getString("Persona_dni"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

      public static List<CompraAR> buscarTodo() {
          List<CompraAR> lista = new ArrayList<>();
          try {
              Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
              System.out.println("Conectado a BBDD");
              Statement sentencia = con.createStatement();
              ResultSet rs = sentencia.executeQuery("SELECT * FROM compra");
              while (rs.next()) {
                  lista.add(new CompraAR(rs.getInt("id"), rs.getDate("Fecha").toLocalDate(), rs.getString("Concepto"),
                          rs.getFloat("Importe"), rs.getString("Persona_dni")));
              }
              return lista;

          } catch (SQLException e) {
              e.printStackTrace();
          }
          return null;
      }

          public static List<CompraAR> buscarOrdenado() {
              List<CompraAR> listaOrdenado = new ArrayList<>();
              try {
                  Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
                  System.out.println("Conectado a BBDD");
                  Statement sentencia = con.createStatement();
                  ResultSet rs = sentencia.executeQuery("SELECT * FROM compra ORDER BY Concepto");
                  while (rs.next()) {
                      listaOrdenado.add(new CompraAR(rs.getInt("id"), rs.getDate("Fecha").toLocalDate(), rs.getString("Concepto"),
                              rs.getFloat("Importe"), rs.getString("Persona_dni")));
                  }
                  return listaOrdenado;

              } catch (SQLException e) {
                  e.printStackTrace();
              }
              return null;
          }

        public static List<CompraAR> buscarOrdenadoFecha() {
            List<CompraAR> listaOrdenadoFecha = new ArrayList<>();
            try {
                Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("Conectado a BBDD");
                Statement sentencia = con.createStatement();
                ResultSet rs = sentencia.executeQuery("SELECT * FROM compra ORDER BY Fecha DESC");
                while (rs.next()) {
                    listaOrdenadoFecha.add(new CompraAR(rs.getInt("id"), rs.getDate("Fecha").toLocalDate(), rs.getString("Concepto"),
                            rs.getFloat("Importe"), rs.getString("Persona_dni")));
                }
                return listaOrdenadoFecha;

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

}
