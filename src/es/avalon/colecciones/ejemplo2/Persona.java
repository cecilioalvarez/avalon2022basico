package es.avalon.colecciones.ejemplo2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private Date Fnacimiento;

    public String getNombre() {
        return nombre;
    }
    public int getEdad(){
        Calendar calendario1= new GregorianCalendar();
        calendario1.setTime(new Date());
        int actual=calendario1.get(Calendar.YEAR);

        Calendar calendario2= new GregorianCalendar();
        calendario2.setTime(Fnacimiento);
        int nacimiento=calendario2.get(Calendar.YEAR);

        return actual-nacimiento;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Date getFnacimiento() {


        return Fnacimiento;
    }
    public void setFnacimiento(Date fnacimiento) {

        Fnacimiento = fnacimiento;
    }

    public Persona(String nombre, Date fnacimiento) {
        this.nombre = nombre;
        Fnacimiento = fnacimiento;
    }
}

