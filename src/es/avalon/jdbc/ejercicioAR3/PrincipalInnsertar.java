package es.avalon.jdbc.ejercicioAR3;

import java.time.LocalDate;

public class PrincipalInnsertar {
    public static void main(String[] args) {
        Compras c= new Compras(LocalDate.now(),"televisor",250,"3C");
        c.insertar();
    }
}
