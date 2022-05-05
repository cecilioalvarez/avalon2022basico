package es.avalon.jdbc;

import java.util.List;

public class _07PrincipalUsoARMejorada {

    public static void main(String[] args) {

        //Probamos las consultas PreparedStatement
        PersonaARMejorada p = new PersonaARMejorada("312", "Laura", 29);

        p.insertar();
        //p.borrar();
        //p.actualizar();
        System.out.println(PersonaARMejorada.buscarUno("44").getNombre());


        List<PersonaARMejorada> personas = PersonaARMejorada.buscarTodos();
        for (PersonaARMejorada persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
        }


    }
}
