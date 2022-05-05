package es.avalon.jdbc2;

import es.avalon.jdbc.Ejercicio001.DataBaseHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaRepository{

    public static void insertar(Persona persona) {
        //Ponemos los parentesis y la llave por debajo de la conexion para que java cierre automaticamente los recursos.
        //de la otra forma la conexion seguia abierta. Tendriamos que haber añadido una clausula Finally para cerralos
        try (
                Connection con = DataBaseHelper.getConexion();
                //Esto es lo que llamamos una consulta parametrizada
                PreparedStatement sentencia = con.prepareStatement("insert into personas (DNI,Nombre,Apellidos) values (?,?,?)")) {
            sentencia.setString(1, persona.getDni());
            sentencia.setString(2, persona.getNombre());
            sentencia.setString(3, persona.getApellidoas());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void borrar (Persona persona) {
        try (
                Connection con = DataBaseHelper.getConexion();
                PreparedStatement sentencia = con.prepareStatement("DELETE FROM `personas` WHERE dni=?")) {
            sentencia.setString(1, persona.getDni());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);


        }
    }
}