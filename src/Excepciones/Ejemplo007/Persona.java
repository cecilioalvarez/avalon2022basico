package Excepciones.Ejemplo007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Persona {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escriba una fecha");
        String fecha = sc.nextLine();
        Date FechaReal;
        SimpleDateFormat fromateador = new SimpleDateFormat("d/M/y");

        try {
            FechaReal = fromateador.parse(fecha);
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(FechaReal);
            System.out.println(calendario.get(Calendar.YEAR));
            System.out.println(calendario.get(Calendar.MONTH));
            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
            System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
            System.out.println(calendario.get(Calendar.WEEK_OF_YEAR));

            calendario.add(Calendar.MONTH,1);
            Date otraFecha = calendario.getTime();
            String textofecha = fromateador.format(otraFecha);
            System.out.println(textofecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
