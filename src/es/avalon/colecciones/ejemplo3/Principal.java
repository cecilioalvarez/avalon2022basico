package es.avalon.colecciones.ejemplo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("por favor introduce una fecha");
        String fecha=sc.nextLine();
        System.out.println(fecha);
        Date fechaReal;
        SimpleDateFormat formateador=new SimpleDateFormat("d/M/y");
        try {
            fechaReal=formateador.parse(fecha);
            Calendar calendario=new GregorianCalendar();
            calendario.setTime(fechaReal);
            System.out.println(calendario.get(Calendar.YEAR));
            System.out.println(calendario.get(Calendar.DATE));
            System.out.println(calendario.get(Calendar.MONTH));
            System.out.println(calendario.get(Calendar.WEEK_OF_MONTH));
            System.out.println(calendario.get(Calendar.DAY_OF_YEAR));


            calendario.add(Calendar.DATE,5);
            Date otraFechaReal=calendario.getTime();

            SimpleDateFormat otroFormateador=new SimpleDateFormat("y-M-d");
            String textoFecha=otroFormateador.format(otraFechaReal);
            System.out.println(textoFecha);


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
