package es.avalon.jdbc.Ejercicio001;

import java.util.List;

public class PrincipalAR {

    public static void main(String[] args) {
        //PersonaAR p=new PersonaAR("6","jorge","lopez");
        //p.insertar();
        //p.borrar();
        //p.actualizar();
       /* PersonaAR persona=PersonaAR.buscarUno("123");
        System.out.println(persona.getDni());
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());*/
        //PersonaAR.todosLasPersonas();
        List<PersonaAR>lista=PersonaAR.buscarTodos();
        for (PersonaAR p:lista
             ) {
            System.out.println(p.getNombre());
            System.out.println(p.getApellido());

        }



    }
}
