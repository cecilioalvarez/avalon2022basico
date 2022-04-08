package es.avalon.objetos.ejercicio03Bolsa;

public class Principal {
    public static void main(String[] args) {

        //Creamos objeto bolsa
        Bolsa b1 = new Bolsa("Roja");

        //Añadimos productos
        b1.addProducto(new Producto("Cafe", 1.2));
        b1.addProducto(new Producto("Pan", 0.2));
        b1.addProducto(new Producto("Tomates", 2));
        b1.addProducto(new Producto("Arroz", 1));


        Bolsa.productosBolsa(b1);
        System.out.println("\nEl peso total de la bolsa es: " + b1.getPesoTotal());


    }


}
