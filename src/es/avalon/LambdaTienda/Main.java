package es.avalon.LambdaTienda;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Productos p1= new Productos(1,"Ordenador",1000, "Tecnologia");
        Productos p2= new Productos(2,"Mesa",100, "Oficina");
        Productos p3= new Productos(3,"Silla",50, "Oficina");
        Productos p4= new Productos(4,"Leche",1.5, "Alimentación");
        Productos p5= new Productos(5,"Monitor",200, "Tecnologia");
        Productos p6= new Productos(6,"Aspirina",2, "Farmacia");

        ArrayList<Productos> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);


        filtrarProductoImporte(lista,(p)->p.getCategoria().equals("Farmacia"));
        filtrarProductoImporte(lista,(p)->p.getImporte()>200);
    }

    public static void filtrarProductoImporte(ArrayList<Productos> lista, FiltroProducto filtro){

        for(Productos p: lista){

            if (filtro.filtro(p)){
                System.out.println(p.getConcepto());
            }

        }

    }


}
