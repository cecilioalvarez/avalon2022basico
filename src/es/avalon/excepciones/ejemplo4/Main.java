package es.avalon.excepciones.ejemplo4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Date fecha = new Date();
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);

        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
    }
}
