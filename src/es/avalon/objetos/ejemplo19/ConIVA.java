package es.avalon.objetos.ejemplo19;

public class ConIVA extends Compra{

    public ConIVA(double precio, int id, String concepto) {
        super(precio, id, concepto);
    }

    @Override
    public double getPrecioConIVA() {
        return  getPrecio()*1.21;
    }
}
