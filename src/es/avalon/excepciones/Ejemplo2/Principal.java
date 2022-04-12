package es.avalon.excepciones.Ejemplo2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {

        Date fecha=null;
        DateFormat formateador=new SimpleDateFormat("dd/MM/yy");
        try{
            fecha=formateador.parse("03/12/2022");
            Calendar calendario=new GregorianCalendar();
            calendario.setTime(fecha);
            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.MONTH)+1);
            System.out.println(calendario.get(Calendar.YEAR));

        } catch (ParseException e) {
            System.out.println("fecha incorreta");
            System.out.println(e.getMessage());
        }


    }
}
