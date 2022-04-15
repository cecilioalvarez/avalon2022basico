package es.avalon.trycathejemplo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {

    GestorFechas gestorFechas = new GestorFechas();
    gestorFechas.sumaDiasMes("11/11/12","12/11/10","13/11/10");
/*    Date fecha = null;
    DateFormat formateador = new SimpleDateFormat("dd/M/yy");

        try {
            fecha = formateador.parse("10/10/2022");
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(fecha);
            System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendario.get(Calendar.MONTH)+1);
            System.out.println(calendario.get(Calendar.YEAR));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Fecha incorrecta");
            System.out.println(e.getMessage());
        }/*/


    }
}
