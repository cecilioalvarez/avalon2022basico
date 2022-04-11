package es.avalon.objetos.ejemplo19;

public class ReducidoIVA extends Compra{
    public ReducidoIVA(double precio, int id, String concepto) {
        super(precio, id, concepto);
    }
    @Override
    public double getPrecioConIVA() {
        return  getPrecio()*1.10;
    }
}
