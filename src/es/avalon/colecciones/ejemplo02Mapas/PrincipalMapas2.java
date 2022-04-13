package es.avalon.colecciones.ejemplo02Mapas;

import java.util.HashMap;

public class PrincipalMapas2 {

    public static void main(String[] args) {
        Persona p1 = new Persona("1", "Pedro", "Gomez");
        Persona p2 = new Persona("2", "Ana", "Sanchez");
        Persona p3 = new Persona("3", "Gema", "Lopez");
        Persona p4 = new Persona("4", "David", "Blanco");
        Persona p5 = new Persona("5", "Oscar", "Gutierrez");

        //Generamos un mapa
        HashMap<String, Persona> mapaComplejo = new HashMap<>();

        //Añadimos los objetos
        mapaComplejo.put(p1.getDni(),p1);
        mapaComplejo.put(p2.getDni(),p2);
        mapaComplejo.put(p3.getDni(),p3);
        mapaComplejo.put(p4.getDni(),p4);
        mapaComplejo.put(p5.getDni(),p5);

        //Podemos crear un objeto y pasarle el dato del mapeo con la clave
        Persona pb= mapaComplejo.get("3");
        System.out.println(pb.getNombre());
        System.out.println(pb.getApellido());

        //O podemos directamente imprimirlo sacando la clave
        System.out.println(mapaComplejo.get("3").getNombre());
        System.out.println(mapaComplejo.get("3").getApellido());
    }
}
