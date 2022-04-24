package es.avalon.APIsCore.Genericos.ejemplo4;

public class Main {

    public static void main(String[] args) {

        Galleta g1 = new Galleta("Chocolate", 0.1);
        Galleta g2 = new Galleta("Vainilla",0.2);
        Galleta g3 = new Galleta("Fresa",0.1);

        CajaProducto<Galleta> cajaGalletas= new CajaProducto<Galleta>(2);
        cajaGalletas.add(g1);
        cajaGalletas.add(g2);
        //No se inserta por que no cabe por el tope
        cajaGalletas.add(g3);

        for (Galleta g : cajaGalletas){
            System.out.println(g.getSabor());
            System.out.println(g.getPrecio());

        }

        System.out.println(cajaGalletas.precioTotal());
        Caja<Libro> cajaLibro = new Caja<Libro>();
    }
}
