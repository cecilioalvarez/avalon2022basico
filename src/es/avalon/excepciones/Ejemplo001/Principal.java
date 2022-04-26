package es.avalon.excepciones.Ejemplo001;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {

        Date fecha = null;
        SimpleDateFormat formateador = new SimpleDateFormat("dd/mm/yy");
        try {
            fecha= formateador.parse("10/11/2022");
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(fecha);
            System.out.println(calendario.get(Calendar.MONTH));
            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.YEAR));

        } catch (ParseException e) {
            System.out.println("fecha incorrecta");
            System.out.println(e.getMessage());
        }
    }
}
