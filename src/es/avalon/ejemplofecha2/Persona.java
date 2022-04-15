package es.avalon.ejemplofecha2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {

    private Date fechaNacimiento = null;
    private Date fechaActual = new Date();



    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }



    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void getEdad(String fechaN){


        DateFormat formateador = new SimpleDateFormat("dd/M/yy");

        try {
            fechaNacimiento = formateador.parse(fechaN);
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(fechaNacimiento);
            int anioN = calendario.get(Calendar.YEAR);
            calendario.setTime(fechaActual);
            int edad = calendario.get(Calendar.YEAR) - anioN ;
            System.out.println("La edad actual es: " + edad);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Fecha incorrecta");
            System.out.println(e.getMessage());
        }

    }

}
