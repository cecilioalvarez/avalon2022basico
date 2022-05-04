package jdbc.AR;

import Lmbdas.Ejemplo1personaComparator.Persona;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CompraAddRecord {
  private int numero;
  private String Fecha;
  private  String Concepto;
  private int importe;
  private personaAddRecord personas_dni;
  private int regalo_id;

    static final String DB_URL = "jdbc:mysql://localhost:3306/pedidos";
    static final String USUARIO="root";
    static final String CLAVE="";
    private  Connection con;

    public CompraAddRecord(int numero, String fecha, String concepto, int importe, personaAddRecord personas_dni, int regalo_id) {
        try {
            con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.numero = numero;
        Fecha = fecha;
        Concepto = concepto;
        this.importe = importe;
        this.personas_dni = personas_dni;
        this.regalo_id = regalo_id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public personaAddRecord getPersonas_dni() {
        return personas_dni;
    }

    public void setPersonas_dni(personaAddRecord personas_dni) {
        this.personas_dni = personas_dni;
    }

    public int getRegalo_id() {
        return regalo_id;
    }

    public void setRegalo_id(int regalo_id) {
        this.regalo_id = regalo_id;
    }
    /****************************************/


    public void insertar(){
        try {

            PreparedStatement sentenciaPre = con.prepareStatement("insert into productos values (?,?,?,?,?,?)");
            sentenciaPre.setInt(1,getNumero());
            sentenciaPre.setString(2,getFecha());
            sentenciaPre.setString(3,getConcepto());
            sentenciaPre.setInt(4,getImporte());
            sentenciaPre.setString(5,getPersonas_dni().getDni());
            sentenciaPre.setInt(6,getRegalo_id());
            sentenciaPre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }

    public  CompraAddRecord buscaruno(int numero){
        try {
            PreparedStatement sentenciaPre = con.prepareStatement("select * from productos where numero= ?");
            sentenciaPre.setInt(1,numero);
            ResultSet rs = sentenciaPre.executeQuery();
            rs.next();
            return (new CompraAddRecord(rs.getInt(1),rs.getString(2),rs.getString(3),
                    rs.getInt(4),(new personaAddRecord().buscaruno(rs.getString(5))),rs.getInt(6)));
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
        return null;
    }


    public ArrayList<CompraAddRecord> buscarTodos(){
        ArrayList<CompraAddRecord> lascompras = new ArrayList<CompraAddRecord>();
        try {
            Connection con = DriverManager.getConnection(DB_URL,USUARIO,CLAVE);
            PreparedStatement sentenciaPre = con.prepareStatement("select * from productos");
            ResultSet rs = sentenciaPre.executeQuery();
            while (rs.next())
            {
                lascompras.add(new CompraAddRecord(rs.getInt(1),rs.getString(2),rs.getString(3),
                                rs.getInt(4),(new personaAddRecord().buscaruno(rs.getString(5))),rs.getInt(6)));

            }
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
        return lascompras;
    }

    public void modificar(){
        try {

            PreparedStatement sentenciaPre =
                    con.prepareStatement("UPDATE `productos` SET `Fecha`=?,`Concepto`=?,`Importe`=?,`Personas_dni`=?,`regalo_id`=? WHERE Numero=?");


            sentenciaPre.setString(1,getFecha());
            sentenciaPre.setString(2,getConcepto());
            sentenciaPre.setInt(3,getImporte());
            sentenciaPre.setString(4,getPersonas_dni().getDni());
            sentenciaPre.setInt(5,getRegalo_id());
            sentenciaPre.setInt(6,getNumero());
            sentenciaPre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }

    public void borrar(){
        try {
            PreparedStatement sentenciaPre = con.prepareStatement("DELETE FROM `productos` WHERE numero = ?");
            sentenciaPre.setInt(1,getNumero());
            sentenciaPre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("conexion con fallo: "+e);
            e.printStackTrace();
        }
    }


}
