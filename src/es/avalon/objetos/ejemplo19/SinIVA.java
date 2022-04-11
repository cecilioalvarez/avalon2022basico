package es.avalon.objetos.ejemplo19;

public class SinIVA extends Compra {
    public SinIVA(double precio, int id, String concepto) {
        super(precio, id, concepto);
    }

    @Override
    public double getPrecioConIVA() {
        return getPrecio() * 1.00;
    }
}