package es.avalon.excepciones.Ejemplo007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce una fecha");
        String fecha=sc.nextLine();//La fecha se introduce como un String
        System.out.println(fecha);

        Date fechaReal;
        SimpleDateFormat formateador=new SimpleDateFormat("d/M/y"); //fijamos el formato que queremos con SimpleDateFormat
        try {
            //el .parse pasa de formato String a formato Date
            fechaReal=formateador.parse(fecha);//Pasamos de formato String "fecha" a formato Date "fechareal"
            Calendar c=new GregorianCalendar();//Creamos un objeto calendar
            c.setTime(fechaReal);//Le asignamos al objeto calendar c el valor de fechareal que esta en formato Date
            System.out.println(c.get(Calendar.DAY_OF_MONTH));
            System.out.println(c.get(Calendar.MONTH));
            System.out.println(c.get(Calendar.YEAR));
            System.out.println(c.get(Calendar.DAY_OF_YEAR));

            c.add(Calendar.DATE,10);
            Date otraFecha=c.getTime();
            //el .format pasa del Objeto "Date" a cadena String
            String textoFecha=formateador.format(otraFecha);
            System.out.println(textoFecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
