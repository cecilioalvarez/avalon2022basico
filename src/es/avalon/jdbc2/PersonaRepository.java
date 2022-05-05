package es.avalon.jdbc2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static es.avalon.jdbc.DatabaseHelper.getConexion;

public class PersonaRepository {

    public void insertar(Persona persona) {

        try (
                Connection con = getConexion();
                PreparedStatement sentencia = con
                        .prepareStatement("INSERT INTO personas (dni,nombre,apellido) VALUES (?,?,?)");){

            sentencia.setString(1,persona.getDni());
            sentencia.setString(2,persona.getNombre());
            sentencia.setString(3,persona.getApellido());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrar(Persona persona) {

        try (
                Connection con = getConexion();
                PreparedStatement sentencia = con.prepareStatement("DELETE FROM personas WHERE Dni= ?");){
            sentencia.setString(1, persona.getDni());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

}
