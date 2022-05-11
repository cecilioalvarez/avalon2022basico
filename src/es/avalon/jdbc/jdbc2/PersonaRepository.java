package es.avalon.jdbc.jdbc2;
import es.avalon.jdbc.ejercicio04.DataBaseHelper;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static es.avalon.jdbc.ejercicio04.DataBaseHelper.getConexion;


public class PersonaRepository {
    public void insertar(Persona persona) {


        try (
                Connection con = DataBaseHelper.getConexion();
                PreparedStatement sentencia= con.
                        prepareStatement("insert into personas(Dni,nombre,edad)  values (?,?,?)");)
        {
            sentencia.setString(1, persona.getDni());
            sentencia.setString(2, persona.getNombre());
            sentencia.setInt(3,persona.getEdad());
            sentencia
                    .executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(Persona persona){
        try (
                Connection con = getConexion();
                PreparedStatement sentencia = con.prepareStatement("delete from personas where Dni=?");)
        {
            sentencia.setString(1,persona.getDni());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}