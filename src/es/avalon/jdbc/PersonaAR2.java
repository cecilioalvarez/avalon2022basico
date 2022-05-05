package es.avalon.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static es.avalon.jdbc.DatabaseHelper.getConexion;

public class PersonaAR2 {

    private String dni;
    private String nombre;
    private String apellido;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public PersonaAR2(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public void insertar() {

        try (
            Connection con = getConexion();
            Statement sentencia = con.prepareStatement("INSERT INTO personas (dni,nombre,apellido) VALUES (?,?,?)");){

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrar() {

        try (
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("DELETE FROM personas WHERE Dni= ?");){
            sentencia.setString(1, getDni());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void actualizar() {

        try (
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("INSERT INTO personas (dni,nombre,apellido) VALUES (?,?,?)");){
            sentencia.setString(1,getDni());
            sentencia.setString(2,getNombre());
            sentencia.setString(3,getApellido());

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PersonaAR2 buscar(String dni) {

        try (
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("SELECT * FROM personas WHERE Dni= ?");){
            ResultSet rs = sentencia.executeQuery();
            rs.next();
            return new PersonaAR2(rs.getString("dni"), rs.getString("Nombre"), rs.getString("Apellido"));

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<PersonaAR2> buscarTodo() {
        List<PersonaAR2> lista = new ArrayList<>();
        try (
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("SELECT * FROM personas");){
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()){
                lista.add(new PersonaAR2(rs.getString("dni"), rs.getString("Nombre"), rs.getString("Apellido")));
            }
            if (lista.size()>0){
                return lista;
            }
            else return null;

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
