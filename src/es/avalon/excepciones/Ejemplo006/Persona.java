package es.avalon.excepciones.Ejemplo006;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;

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
    public int getEdad(){
        Calendar calendario=new GregorianCalendar();
        calendario.setTime(fechaNacimiento);
        calendario.get(Calendar.YEAR);
        Date b;
        Calendar calendario2=new GregorianCalendar();
        calendario2.setTime(new Date());
        int edad=calendario2.get(Calendar.YEAR)-calendario.get(Calendar.YEAR);
        return edad;


    }

}
