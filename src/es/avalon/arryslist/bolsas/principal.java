package es.avalon.arryslist.bolsas;

public class principal {

    public static void main(String[] args){
        Bolsa b = new Bolsa("Azul");
        b.addProductos(new Producto("Prueba",1));
        b.addProductos(new Producto("Prueba2",4));
        b.addProductos(new Producto("Prueba3",3));
        b.addProductos(new Producto("Prueba4",1));


    }

}
