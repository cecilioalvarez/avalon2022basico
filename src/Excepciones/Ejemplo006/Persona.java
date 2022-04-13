package Excepciones.Ejemplo006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
    private String Nombre;
    private Date fecha;

    public Persona(String nombre, String fechas) {
        Nombre = nombre;
        SimpleDateFormat formateador = new SimpleDateFormat("dd-M-yy");

        try {
            fecha = formateador.parse(fechas);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad(){
        int edad=0;
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fecha);
        System.out.println();
        edad =2022-calendario.get(Calendar.YEAR);
        return edad;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
