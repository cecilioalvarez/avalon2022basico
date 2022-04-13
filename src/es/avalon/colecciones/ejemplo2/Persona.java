package es.avalon.colecciones.ejemplo2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {

        Calendar calendario1= new GregorianCalendar();
        calendario1.setTime(new Date());
        int actual=calendario1.get(Calendar.YEAR);

        Calendar calendario2= new GregorianCalendar();
        calendario2.setTime(fechaNacimiento);
        int nacimiento=calendario2.get(Calendar.YEAR);

        return actual-nacimiento;


    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }


}
