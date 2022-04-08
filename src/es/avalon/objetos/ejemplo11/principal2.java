package es.avalon.objetos.ejemplo11;

import java.util.ArrayList;

public class principal2 {
    public static void main(String[] args) {
        persona p= new persona("edwin");
        p.addChaqueta(new chaqueta("azul",50));
        p.addChaqueta(new chaqueta("amarillo",20));

        ArrayList<chaqueta> chaquetas=p.getChaquetas();
        for (int i=0;i<chaquetas.size();i++){
            System.out.println(chaquetas.get(i).getPrecio());

        }

    }
}
