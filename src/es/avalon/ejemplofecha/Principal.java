package es.avalon.ejemplofecha;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {

    public static void main(String[] args) {
        Date fecha = new Date();
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.MONTH)+1);
        System.out.println(calendario.get(Calendar.YEAR));
    }
}
