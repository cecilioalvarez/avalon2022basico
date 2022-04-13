package es.avalon.colecciones.ejemplo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

    public class Principal {

    public static void main(String[] args) {
        SimpleDateFormat formateador= new SimpleDateFormat("d/MM/YY");
        Date fecha=null;
        try {
            fecha=formateador.parse("1/01/2000");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Persona p= new Persona("pedro",fecha);

        System.out.println(p.getEdad());

    }
}
