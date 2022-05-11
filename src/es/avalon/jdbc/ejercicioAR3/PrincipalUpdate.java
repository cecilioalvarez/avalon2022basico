package es.avalon.jdbc.ejercicioAR3;

import es.avalon.jdbc.ejercicio2.PersonaAR;

import java.time.LocalDate;

public class PrincipalUpdate {
    public static void main(String[] args) {
        Compras c=new Compras(2,LocalDate.now(),"Camisa",185,"1A");
        c.update();
    }





}
