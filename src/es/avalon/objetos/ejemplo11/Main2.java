package es.avalon.objetos.ejemplo11;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Persona p = new Persona(123);
        p.addChaqueta(new Chaqueta("azul", 50));
        p.addChaqueta(new Chaqueta("amarillo", 20));


        ArrayList<Chaqueta> chaqueta = p.getChaquetas();
        for (int i = 0; i <chaqueta.size();i++){
            System.out.println(chaqueta.get(i).getPrecio());
            System.out.println(chaqueta.get(i).getColor());

        }
    }
}
