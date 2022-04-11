package Objetos.Ejemplo019;

public class IVA10 extends Compra{

    public IVA10(int numero, String concepto, double coste) {
        super(numero, concepto, coste);
    }
    @Override
    public double valor(){
        return  super.getCoste()*1.1;
    }
    @Override
    public double getIvaImporte() {
        return valor()+(super.getCoste()*0.30);
    }
}
