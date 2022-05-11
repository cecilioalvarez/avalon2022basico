package es.avalon.jdbc.ejercicioAR3;

import es.avalon.jdbc.ejercicio2.PersonaAR;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compras {
    static final String URL="jdbc:mysql://localhost:3306/prueba";
    static final  String USUARIO="root";
    static final  String CLAVE="";


    private int Num;
    private LocalDate fecha;
    private String concepto;
    private double importe;
    private String dniPersona;

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
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

    public String getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(String dniPersona) {
        this.dniPersona = dniPersona;
    }

    public Compras(LocalDate fecha, String concepto, double importe, String dniPersona) {

        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.dniPersona = dniPersona;
    }

    public Compras(int num, LocalDate fecha, String concepto, double importe, String dniPersona) {
        Num = num;
        this.fecha = fecha;
        this.concepto = concepto;
        this.importe = importe;
        this.dniPersona = dniPersona;
    }

    public Compras(int num) {
        Num = num;
    }

    public void insertar(){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            // el objeto statement se encarga de crear una sentencia
            Statement sentencia= con.createStatement();
            //el metodo executeQuery se encarga de ejecutar la sentencia
            //este metodo devuelve un resultSET
            sentencia
                    .executeUpdate("insert into Compras (fecha,concepto,importe,Persona_Dni) values ('"+getFecha()+
                            "','"+getConcepto()+"',"+getImporte()+",'"+getDniPersona()+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void delete(){
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("delete from compras where Num="+ getNum());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(){
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("update compras set fecha='"+getFecha()+"',concepto='"+getConcepto()+"',importe='"+getImporte()+"', Persona_Dni='"+getDniPersona()+"'" +
                    "where Num="+ getNum() +"");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Compras BuscarUno(int Num){
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("select * from compras where Num='"+Num+"'");
            rs.next();

            return new Compras(rs.getInt("Num"),rs.getDate("fecha").toLocalDate(), rs.getString("concepto"),
                    rs.getDouble("importe"),rs.getString("Persona_Dni"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;



    }
    public static List<Compras> BuscarTodo(){
        List<Compras> lista=new ArrayList<>();
        try {
            Connection con= DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("estamos conectados");
            Statement sentencia= con.createStatement();
            ResultSet rs= sentencia.executeQuery("select * from compras");
            while (rs.next()){

                lista.add(new Compras(rs.getInt("Num"),rs.getDate("fecha").toLocalDate(), rs.getString("concepto"),
                        rs.getDouble("importe"),rs.getString("Persona_Dni")));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
