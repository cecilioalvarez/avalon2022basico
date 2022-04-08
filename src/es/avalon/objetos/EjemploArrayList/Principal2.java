package es.avalon.objetos.EjemploArrayList;

import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {

        Persona p= new Persona("David",24,"123456789");
        p.addChaqueta(new Chaqueta("azul",25));
        p.addChaqueta(new Chaqueta("rojo",52));

        //obtener lista chaqueta persona
        ArrayList<Chaqueta> chaquetas=p.getChaquetas();
        for(int x=0;x< chaquetas.size();x++){
            System.out.println(chaquetas.get(x).getPrecio());
        }
    }
}
