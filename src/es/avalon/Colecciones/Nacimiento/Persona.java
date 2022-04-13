package es.avalon.Colecciones.Nacimiento;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private Date fNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Persona(String nombre, Date fNacimiento) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }

    public int edad() {
        Calendar calendario1=new GregorianCalendar();
        calendario1.setTime(new Date());
        int fActual=calendario1.get(Calendar.YEAR);

        Calendar calendario2=new GregorianCalendar();
        calendario2.setTime(new Date());
        int fNacimiento=calendario2.get(Calendar.YEAR);

        int años=fActual-fNacimiento;
        return años;
    }
}

