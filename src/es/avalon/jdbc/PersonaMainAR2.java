package es.avalon.jdbc;

import java.util.List;

public class PersonaMainAR2 {
    public static void main(String[] args) {

         PersonaAR2 p = new PersonaAR2("50","Juan","Garcia");
        p.insertar();



        /*PersonaAR2 p = new PersonaAR2("50","Juan","Garcia");
        p.borrar();

        PersonaAR2 persona= PersonaAR2.buscar("55555555B");
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());

        List<PersonaAR2> lista=PersonaAR2.buscarTodo();
        for(PersonaAR2 p:lista){

            System.out.println(p.getNombre()+" "+p.getApellido());
        }*/

    }

}
