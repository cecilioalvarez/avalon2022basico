package es.avalon.Colecciones.Fecha4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main2 {

    public static void main(String[] args) {
        SimpleDateFormat formateador=new SimpleDateFormat("d*M*yy");
        Date fecha=null;
        try {
            fecha=formateador.parse("12*04*2022");
        } catch (ParseException e) {
            System.out.println("Hay un error en la fecha");
        }
        Calendar calendario=new GregorianCalendar();
        calendario.setTime(fecha);

        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.MONTH)+1);
        System.out.println(calendario.get(Calendar.YEAR));

        System.out.println(formateador.format(fecha));
    }
}
