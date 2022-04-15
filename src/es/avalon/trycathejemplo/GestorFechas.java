package es.avalon.trycathejemplo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GestorFechas {

    private Date fecha1 = null;
    private Date fecha2 = null;
    private Date fecha3 = null;

    public Date getFecha1() {
        return fecha1;
    }

    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    public Date getFecha3() {
        return fecha3;
    }

    public void setFecha3(Date fecha3) {
        this.fecha3 = fecha3;
    }

    public void sumaDiasMes(String f1, String f2, String f3) {
        DateFormat formateador = new SimpleDateFormat("dd/M/yy");
        int sumaMes = 0;

        try {
            fecha1 = formateador.parse(f1);
            fecha2 = formateador.parse(f2);
            fecha3 = formateador.parse(f3);
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(fecha1);
            sumaMes = sumaMes + calendario.get(Calendar.DAY_OF_MONTH);
            calendario.setTime(fecha2);
            sumaMes = sumaMes + calendario.get(Calendar.DAY_OF_MONTH);
            calendario.setTime(fecha3);
            sumaMes = sumaMes + calendario.get(Calendar.DAY_OF_MONTH);
            System.out.println("la suma de los días es: "+sumaMes);

        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Fecha incorrecta");
            System.out.println(e.getMessage());
        }



    }
}
