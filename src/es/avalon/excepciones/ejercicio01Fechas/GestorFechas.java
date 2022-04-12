package es.avalon.excepciones.ejercicio01Fechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GestorFechas {

    public int sumaDias(String fecha1, String fecha2, String fecha3){

        //Formateador
        DateFormat formateador = new SimpleDateFormat("dd/M/yy");
        int total = 0;

        try {
            //Creamos fecha con el formateador al que le pasamos la fecha en formato string
            Date f1 = formateador.parse(fecha1);
            Date f2 = formateador.parse(fecha2);
            Date f3 = formateador.parse(fecha3);

            //Creamos calendario gregoriano, le pasamos fecha y creamos variable entera del dia
            Calendar c1 = new GregorianCalendar();
            c1.setTime(f1);
            int d1 = c1.get(Calendar.DAY_OF_MONTH);

            Calendar c2 = new GregorianCalendar();
            c2.setTime(f2);
            int d2 = c2.get(Calendar.DAY_OF_MONTH);

            Calendar c3 = new GregorianCalendar();
            c3.setTime(f3);
            int d3 = c3.get(Calendar.DAY_OF_MONTH);

            //Sumamos variables
            total = d1 + d2 + d3;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return total;
    }
}
