package es.avalon.objetos.Ejemplo11;

import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {
        Persona p=new Persona("72100000");
        p.addChaqueta(new Chaqueta("azul",50));
        p.addChaqueta(new Chaqueta("roja",70));

        ArrayList<Chaqueta>chaquetas=p.getChaquetas();
        for (int i=0;i<chaquetas.size();i++){
            System.out.println(chaquetas.get(i).getColor());
            System.out.println(chaquetas.get(i).getPrecio());
        }

        chaquetas.add(new Chaqueta("verde",80));
        System.out.println(chaquetas.size());
        System.out.println(chaquetas.get(0).getColor());
        for (int i=0;i<chaquetas.size();i++){
            System.out.println(chaquetas.get(i).getColor());
            System.out.println(chaquetas.get(i).getPrecio());
        }


    }
}
