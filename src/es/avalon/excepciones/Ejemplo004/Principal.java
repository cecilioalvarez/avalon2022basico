package es.avalon.excepciones.Ejemplo004;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {

    public static void main(String[] args) {
        String fecha1 = "21/12/2205";
        String fecha2 = "21/12/2205";
        String fecha3 = "21/12/2205";
        String fecha4 = "21/12/2205";
        //SimpleDateFormat se encarga de formatear de string a date y viceversa
        DateFormat formateador = new SimpleDateFormat("dd/m/yy");
        try {
            //Pasamos del formato String al formato date
            Date f1 = formateador.parse(fecha1);
            //Pasamos de formato DAte a Calendar
            Calendar c1=new GregorianCalendar();
            c1.setTime(f1);
            Date f2 = formateador.parse(fecha2);
            Calendar c2=new GregorianCalendar();
            c2.setTime(f2);
            Date f3 = formateador.parse(fecha3);
            Calendar c3=new GregorianCalendar();
            c3.setTime(f3);
            Date f4 = formateador.parse(fecha4);
            Calendar c4=new GregorianCalendar();
            c4.setTime(f4);
            System.out.println(c1.get(Calendar.DAY_OF_MONTH));
            System.out.println(c2.get(Calendar.DAY_OF_MONTH));
            System.out.println(c3.get(Calendar.DAY_OF_MONTH));
            System.out.println(c4.get(Calendar.DAY_OF_MONTH));



        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
