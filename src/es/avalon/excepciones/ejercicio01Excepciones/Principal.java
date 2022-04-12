package es.avalon.excepciones.ejercicio01Excepciones;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {

    public static void main(String[] args) {

        Date fecha = null;

        DateFormat formateador = new SimpleDateFormat("dd/MM/yy");


        try {
            fecha = formateador.parse("20/12/2022");
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(fecha);

            System.out.println(calendar.get(Calendar.DATE));
        } catch (ParseException e) {
            System.out.println("Fecha incorrecta");
            System.out.println(e.getMessage());
        }


    }
}
