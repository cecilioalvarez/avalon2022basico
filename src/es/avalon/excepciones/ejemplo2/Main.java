package es.avalon.excepciones.ejemplo2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date fecha = null;
        DateFormat formateador = new SimpleDateFormat("dd/MM/yy");
        try {
            fecha = formateador.parse("10/10/2022");
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(fecha);
            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.WEEK_OF_MONTH));
            System.out.println(calendario.get(Calendar.WEEK_OF_YEAR));
            System.out.println(calendario.get(Calendar.MONTH)+1);
            System.out.println(calendario.get(Calendar.YEAR));
        } catch (ParseException e) {
            System.out.println("fecha incorrecta");
            System.out.println(e.getMessage());
        }
    }
}
