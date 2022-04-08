package es.avalon.objetos.ejercicio03ArrayListObjetosAnidados;

public class Principal {
    public static void main(String[] args) {

        Bolsa b1 = new Bolsa("Roja");

        b1.addProducto(new Producto("Cafe", 1.2));
        b1.addProducto(new Producto("Pan", 0.2));
        b1.addProducto(new Producto("Tomates", 2));
        b1.addProducto(new Producto("Arroz", 1));


        recorrerBolsa(b1);


    }

    public static void recorrerBolsa(Bolsa bolsa){
        System.out.println("\nLos productos de la bolsa " + bolsa.getColor() + " son los siguientes: \n");

        for (int i = 0; i<bolsa.getProductos().size(); i++){
            System.out.println("Producto nº" + (i+1) + ": " + bolsa.getProductos().get(i).getNombre() + " con un peso de " + bolsa.getProductos().get(i).getPeso() + " kg");
        }

    }
}
