package es.avalon.APIsCore.Genericos.ejemplo4;

public class CajaProducto<T extends Producto> extends Caja<T> {

    public CajaProducto(int tope) {
        super();
        this.tope = tope;
    }

    //Este metodo es exclusivo de esta clase por que esta asociada a los productos
    public double precioTotal(){
        double total = 0;
        for (T mitipo : lista) {
            total = total + mitipo.getPrecio();
        }
        return total;
    }
}
