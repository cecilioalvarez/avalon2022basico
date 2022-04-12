package es.avalon.excepciones.ejemplo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {


        Date fecha = null;
        SimpleDateFormat formateador = new SimpleDateFormat("dd/M/yy");
        try {
            fecha = formateador.parse("20/10/2022");
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(fecha);



            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.WEEK_OF_MONTH));
            System.out.println(calendario.get(Calendar.WEEK_OF_YEAR));
            System.out.println(calendario.get(Calendar.MONTH)+1);
            System.out.println(calendario.get(Calendar.YEAR));



        } catch (ParseException e) {
            System.out.println("Fecha incorrecta");
            System.out.println(e.getMessage());


        }
    }

}
