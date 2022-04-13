package es.avalon.excepciones.ejemplo5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {


    private String nombre;
    private Date fechaNacimiento;

    public int getEdad(){
        Calendar c1 = new GregorianCalendar();
        c1.setTime(new Date());
        int actual= c1.get(Calendar.YEAR);

        Calendar c2 = new GregorianCalendar();
        c2.setTime(fechaNacimiento);
        int nacimiento= c2.get(Calendar.YEAR);

        return actual-nacimiento;
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
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
}