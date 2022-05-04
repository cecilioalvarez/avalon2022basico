package es.avalon.jdbc;

import java.util.List;

public class PrincipalAR {
    public static void main(String[] args) {

        //PersonaAR p = new PersonaAR("50","juan",20);
               // p.insertar();
              //  p.eliminar();

     /*   PersonaAR persona= PersonaAR.buscarUno("2");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());*/


        List<PersonaAR> lista= PersonaAR.buscarTodos();
        for (PersonaAR p:lista){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());

        }
    }

}
