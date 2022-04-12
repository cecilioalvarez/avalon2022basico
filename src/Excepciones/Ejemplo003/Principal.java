package Excepciones.Ejemplo003;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        try {
        Date fecha = new Date();
        DateFormat f = new SimpleDateFormat("dd/M/yy");
        Calendar calendario = new GregorianCalendar();

        System.out.println(f.format(fecha));
        System.out.println(fecha);
        System.out.println("***********11-10-2021**********");

            fecha= f.parse("11/10/2021");
            calendario.setTime(fecha);

            System.out.println(f.format(fecha));
            System.out.println(fecha);

            System.out.println("prueba de calendario");
            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.WEEK_OF_MONTH));
            System.out.println(calendario.get(Calendar.WEEK_OF_YEAR));
            System.out.println(calendario.get(Calendar.MONTH)+1);
            System.out.println(calendario.get(Calendar.YEAR));


        } catch (ParseException e) {
            System.out.println("fecha incorrecta");
        }



    }
}
