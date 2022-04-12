package es.avalon.excepciones.Ejemplo2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {

        String fecha2 = "21/10/";
        Date fecha;
        DateFormat formateador=new SimpleDateFormat("dd/MM/yy");
        try{
            fecha=formateador.parse("11/12/2022");
            Calendar calendario=new GregorianCalendar();
            calendario.setTime(fecha);
            fecha2="21/10/2023";
            Date f2=formateador.parse(fecha2);
            Calendar c2=new GregorianCalendar();
            c2.setTime(f2);
            System.out.println(c2.get(c2.DAY_OF_MONTH));



            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.MONTH)+1);
            System.out.println(calendario.get(Calendar.YEAR));

        } catch (ParseException e) {
            System.out.println("fecha incorreta");
            System.out.println(e.getMessage());
        }



    }
}
