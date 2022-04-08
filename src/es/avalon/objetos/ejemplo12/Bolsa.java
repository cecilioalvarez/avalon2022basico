package es.avalon.objetos.ejemplo12;
import java.util.ArrayList;
import java.util.List;
public class Bolsa {
    private List<Producto> lista = new ArrayList<Producto>();



    public Bolsa() {
        super();
    }

    public Bolsa(List<Producto> lista) {
        super();
        this.lista = lista;
    }

    public void addProducto(Producto p) {

        lista.add(p);
    }

    public void addProducto(String nombre, double precio) {

        lista.add(new Producto(nombre, precio));
    }

    public void addProductos(List<Producto> productos) {

        lista.addAll(productos);
    }

    public void addProductos(Producto... productos) {

        for (Producto f : productos) {

            lista.add(f);
        }
    }

}
