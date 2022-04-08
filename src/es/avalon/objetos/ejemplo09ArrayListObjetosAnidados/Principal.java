package es.avalon.objetos.ejemplo09ArrayListObjetosAnidados;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        //Creamos persona y le agregamos chaquetas
        Persona p = new Persona("Jose Luis");
        p.addChaqueta(new Chaqueta("Azul", 50.0));
        p.addChaqueta(new Chaqueta("Verde", 20.0));

        //Volcamos los datos de chaquetas a un array inicializado en esta clase
        ArrayList<Chaqueta> chaquetas = p.getChaquetas();

        //Recorremos las chaquetas
        for (int i=0; i<chaquetas.size(); i++){
            System.out.println(chaquetas.get(i).getPrecio());
        }
    }
}
