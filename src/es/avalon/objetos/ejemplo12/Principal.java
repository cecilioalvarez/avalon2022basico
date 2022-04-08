package es.avalon.objetos.ejemplo12;
import java.util.ArrayList;
import java.util.List;
public class Principal {


    public static void main(String[] args) {

        Producto p1= new Producto ("galletas",3);

        Bolsa b= new Bolsa();
        b.addProducto(p1);
        b.addProducto("chocolate",4);


        List<Producto> productos= new ArrayList<Producto>();
        productos.add(new Producto("pan",2));
        productos.add(new Producto("leche",3));

        b.addProductos(productos);

        double total=0;
        b.addProductos(new Producto("pizza",5),new Producto("lechuga",3));
for (int i =0;i<productos.size();i++);{

           total=total;
        }

    }
}
