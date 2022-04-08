package es.avalon.arryslist.uno_muchos;

import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {

        // creo la clase persona
        Persona p= new Persona("1234");
        //creo dos chaquetas y las añado a la persona
        p.addChaqueta(new Chaqueta("azul",50));
        p.addChaqueta(new Chaqueta("amarillo",20));

        //obtengo la lista de chaquetas de la persona
        ArrayList<Chaqueta> chaquetas= p.getChaquetas();
        for (int i=0;i<chaquetas.size();i++) {
            //recorro la lista de chaquetas e imprimo su precio
            System.out.println(chaquetas.get(i).getPrecio());

        }
    }
}
