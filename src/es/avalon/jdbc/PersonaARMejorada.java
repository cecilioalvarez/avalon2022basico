package es.avalon.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PersonaARMejorada {


    private String dni;
    private String nombre;
    private int edad;

    public PersonaARMejorada(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void insertar() {
        try(
            Connection con = DataBaseHelper.getConexion();
            PreparedStatement sentencia = con
                    .prepareStatement("insert into Personas (dni, nombre, edad) values (?,?,?)");)

        {
            sentencia.setString(1, getDni());
            sentencia.setString(2, getNombre());
            sentencia.setInt(3, getEdad());

            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrar() {
        try (
            Connection con = DataBaseHelper.getConexion();

            PreparedStatement sentencia = con
                    .prepareStatement("delete from Personas where dni=?");)
        {
            sentencia.setString(1, getDni());

            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizar() {
        try (
            Connection con = DataBaseHelper.getConexion();

            PreparedStatement sentencia = con
                    .prepareStatement("update Personas set nombre=?, edad=? where dni=?");)
        {
            sentencia.setString(1, getNombre());
            sentencia.setInt(2, getEdad());
            sentencia.setString(3, getDni());

            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PersonaARMejorada buscarUno(String dni){
        try (
            Connection con = DataBaseHelper.getConexion();

            PreparedStatement sentencia = con
                    .prepareStatement("select * from Personas where dni=?");)
        {
            sentencia.setString(1, dni);

            ResultSet rs = sentencia.executeQuery();
            rs.next();

            return new PersonaARMejorada(rs.getString("dni"),
                                         rs.getString("nombre"),
                                         rs.getInt("edad"));

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<PersonaARMejorada> buscarTodos() {

        List<PersonaARMejorada> personas = new ArrayList<>();
        try (
            Connection con = DataBaseHelper.getConexion();
            PreparedStatement sentencia = con
                    .prepareStatement("select * from Personas");)
        {
            ResultSet rs = sentencia.executeQuery();

            //Recorremos resultados y guardamos en lista
            while (rs.next()) {
                personas.add(new PersonaARMejorada(rs.getString("dni"), rs.getString("nombre"), rs.getInt("edad")));
            }

            return personas;

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
