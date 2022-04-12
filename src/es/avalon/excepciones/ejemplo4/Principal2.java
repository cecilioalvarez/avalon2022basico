package es.avalon.excepciones.ejemplo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal2 {
    public static void main(String[] args) {

        SimpleDateFormat formateador= new SimpleDateFormat("dd M yy");
        Date fecha=null;
        try {
            fecha=formateador.parse("20 10 2025");
        } catch (ParseException e) {
            System.out.println("hay un error con la fecha");
        }

        Calendar calendario= new GregorianCalendar();
        calendario.setTime(fecha);

        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.MONTH));
        System.out.println(calendario.get(Calendar.YEAR));

        System.out.println(formateador.format(fecha));

    }
}
