package es.avalon.jdbc;

import java.awt.*;
import java.util.List;

public class MainAR {
    public static void main(String[] args) {

         /*PersonaAR p = new PersonaAR("50","Juan","Garcia");
        p.insertar();*/

        /*PersonaAR p = new PersonaAR("50","Juan","Garcia");
        p.borrar();*/

        /*PersonaAR persona= PersonaAR.buscar("55555555B");
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());*/

        List<PersonaAR> lista=PersonaAR.buscarTodo();
        for(PersonaAR p:lista){

            System.out.println(p.getNombre()+" "+p.getApellido());
        }

    }

}
