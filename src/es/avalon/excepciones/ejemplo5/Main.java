package es.avalon.excepciones.ejemplo5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/YY");
        Date fecha = null;
        try {
            formateador.parse("1/01/2000");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Persona p1 = new Persona("pedro", fecha);
        System.out.println(p1.getEdad());
    }
}
