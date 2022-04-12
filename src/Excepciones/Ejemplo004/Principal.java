package Excepciones.Ejemplo004;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("11/10/2021");
        lista.add("10/11/2022");
        lista.add("09/10/2022");
        lista.add("09/10/2022");



        System.out.println(sumatoria(lista));
    }

    public static int sumatoria(ArrayList<String> list) {
        int total = 0;
        try {
            Date fecha = new Date();
            DateFormat f = new SimpleDateFormat("dd/M/yy");
            Calendar calendario = new GregorianCalendar();
            for (int i = 0; i < list.size(); i++) {
                fecha = f.parse(list.get(i));
                calendario.setTime(fecha);
                total += calendario.get(Calendar.DAY_OF_MONTH);
            }
        } catch (ParseException e) {
            System.out.println("fecha incorrecta");
        }
        return total;
    }

}
