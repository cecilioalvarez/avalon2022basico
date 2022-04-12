package es.avalon.excepciones.Ejemplo6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        SimpleDateFormat formateador=new SimpleDateFormat("dd/MM/YY");
        Date fecha=null;
        try {
            fecha=formateador.parse("14/03/1980");
            Persona p=new Persona("Jose",fecha);
            Calendar c1=new GregorianCalendar();
            c1.setTime(fecha);
            Calendar c2=new GregorianCalendar();
            c2.setTime(new Date());
            System.out.println(c1.get(Calendar.YEAR));
            System.out.println(c2.get(Calendar.YEAR));
            System.out.println(p.getEdad());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
