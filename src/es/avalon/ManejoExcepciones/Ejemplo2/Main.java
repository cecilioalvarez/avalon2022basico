package es.avalon.ManejoExcepciones.Ejemplo2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date fecha=null;
        DateFormat formateador = new SimpleDateFormat("dd/M/yy");


        try{
            fecha=formateador.parse("12/4/2022");
            Calendar calendario= new GregorianCalendar();
            calendario.setTime(fecha);
            System.out.println(calendario.get(Calendar.YEAR));
            System.out.println(calendario.get(Calendar.MONTH)+1);
            System.out.println(calendario.get(Calendar.MONTH));
            System.out.println(calendario.get(Calendar.DATE));
        }catch (ParseException e){
            System.out.println(e.getMessage());
            System.out.println("Fecha incorrecta");
        }
    }
}
