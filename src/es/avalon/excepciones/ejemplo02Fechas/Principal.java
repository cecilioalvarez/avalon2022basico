package es.avalon.excepciones.ejemplo02Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Objeto para introducir datos por consola
        Scanner sc = new Scanner(System.in);

        //Pedimos y agregamos una fecha por consola
        System.out.println("Por favor introduce una fecha");
        String fecha = sc.nextLine();

        //Mostramos fecha
        System.out.println("La fecha escrita es " + fecha);

        //Creamos objeto Date y formateador para dar formato de fecha
        Date fechaReal;
        SimpleDateFormat formateador = new SimpleDateFormat("d/M/y");


        try {
            //Pasamos mediante el formateador la fecha al objeto fecha
            fechaReal = formateador.parse(fecha);

            //Creamos un objeto Calendar de tipo europeo
            Calendar calendario = new GregorianCalendar();

            //Le ingresamos el objeto fecha
            calendario.setTime(fechaReal);

            //Imprimimos valores
            System.out.println("Año escrito -> " + calendario.get(Calendar.YEAR));
            System.out.println("Dia escrito -> " + calendario.get(Calendar.DATE));
            System.out.println("Mes escrito -> " + calendario.get(Calendar.MONTH));
            System.out.println("Semana del mes -> " + calendario.get(Calendar.WEEK_OF_MONTH));
            System.out.println("Dia del año -> " + calendario.get(Calendar.DAY_OF_YEAR));


            //Le añadimos 5 dias a la fecha escrita
            calendario.add(Calendar.DATE, 5);
            //Creamos otro objeto Fecha y le pasamos el valor del calendario modificado
            Date otraFechaReal = calendario.getTime();
            //Formateamos
            formateador.format(otraFechaReal);

            //Imprimimos nueva fecha
            System.out.println("La fecha modificada con 5 dias mas es -> " + otraFechaReal);

        } catch (ParseException e) {
            e.printStackTrace();
        } finally {

        }

    }

}
