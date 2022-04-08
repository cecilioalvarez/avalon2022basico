package es.avalon.objetos.Ejemplo11;

import es.avalon.objetos.Ejemplo10.Telefono;
//importamos la clase telefono del ejemplo 10

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Un arraylist a diferencia de un array tiene un tamaño dinamico.
        //Se añade elementos con nombreArraylist.add
        ArrayList <Telefono> lista=new ArrayList<Telefono>();
        lista.add(new Telefono("oppo",555));
        lista.add(new Telefono("Nokia",556));
        lista.add(new Telefono("Apple",557));
        lista.add(new Telefono("Xiaomi",558));

        for(int i=0;i<lista.size();i++){
            //se accede al elemento del arraylist con nombreArraylist.get
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }

        System.out.println(lista.get(0).getMarca()+" "+lista.get(0).getNumero());

        System.out.println("..............");
        //con el operador remove eliminamos un elemento del Arraylist
        lista.remove(0);
        for(int i=0;i<lista.size();i++){
            //se accede al elemento del arraylist con nombreArraylist.get
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
        System.out.println("..............");
        lista.set(1,new Telefono("motorola",555));
        for(int i=0;i<lista.size();i++){
            //se accede al elemento del arraylist con nombreArraylist.get
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
    }
}
