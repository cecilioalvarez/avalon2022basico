package es.avalon.excepciones.Ejemplo5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        //¿que tienen asignado? la fecha de ahora
        Date fecha=new Date();
        Calendar calendario=new GregorianCalendar();
        calendario.setTime(fecha);
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));

        SimpleDateFormat formateador=new SimpleDateFormat("dd-M-yy");
        Date fecha1=null;
        try {
            fecha1=formateador.parse("20-10-2020");
        } catch (ParseException e) {
            System.out.println("Hay un error en la fecha");
        }
        Calendar calendario1=new GregorianCalendar();
        calendario1.setTime(fecha1);

        System.out.println(calendario1.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario1.get(Calendar.MONTH));
        System.out.println(calendario1.get(Calendar.YEAR));
        System.out.println("..................");
        System.out.println(formateador.format(fecha));





    }
}
