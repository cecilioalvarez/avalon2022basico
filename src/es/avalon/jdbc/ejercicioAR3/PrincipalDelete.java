package es.avalon.jdbc.ejercicioAR3;

import es.avalon.jdbc.ejercicio2.PersonaAR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class PrincipalDelete {
    public static void main(String[] args) {
        Compras c=new Compras(13);
        c.delete();
    }
}
