package es.avalon.Excepciones.EjercicioFecha;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GestorFecha {


    public int sumaDias(String fecha1, String fecha2, String fecha3) {
        DateFormat formateador = new SimpleDateFormat("d/M/yy");
        int total=0;
        try {
            Date f1=formateador.parse(fecha1);
            Date f2=formateador.parse(fecha2);
            Date f3=formateador.parse(fecha3);
            Calendar c1=


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
