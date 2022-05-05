package es.avalon.jdbc2;

import es.avalon.jdbc.DataBaseHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PersonaRepository {
    public void insertar(Persona persona) {


        try {
            Connection con= DataBaseHelper.getConexion();


            PreparedStatement sentencia = con.prepareStatement("insert into Personas(dni,nombre,edad)values (?,?,?)");

            sentencia.setString(1,persona.getDni());
            sentencia.setString(2,persona.getNombre());
            sentencia.setInt(3,persona.getEdad());

            sentencia.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
