package es.avalon.jdbc;

public class _06PrincipalUsoAR {

    public static void main(String[] args) {

        //Simplificamos la forma de insertar datos en el programa mediante el uso de la clase creada ActiveRecord
        PersonaAR p = new PersonaAR("32", "Maria", 30);

        //Usamos el metodo creado para insertar
        //p.borrar();

        System.out.println(PersonaAR.buscarUno("1").getNombre());
    }
}
