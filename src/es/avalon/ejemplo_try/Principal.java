package es.avalon.ejemplo_try;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Introducir fecha");
        String fecha = sc.nextLine();
        System.out.println(fecha);
        Date fechaReal;
        SimpleDateFormat formateador = new SimpleDateFormat("d/M/y");
        try {
            fechaReal = formateador.parse(fecha);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(fechaReal);
            System.out.println(calendar.get(Calendar.YEAR));
            System.out.println(calendar.get(Calendar.DATE));
            System.out.println(calendar.get(Calendar.MONTH));
            System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
            System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

            calendar.add(Calendar.DATE, 5);
            Date otraFechaReal = calendar.getTime();

            SimpleDateFormat otroFormateaador= new SimpleDateFormat("y-M-d");
            String textoFecha = otroFormateaador.format(otraFechaReal);
            System.out.println(textoFecha);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
