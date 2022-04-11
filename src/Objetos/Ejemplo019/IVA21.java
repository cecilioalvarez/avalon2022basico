package Objetos.Ejemplo019;

public class IVA21 extends  Compra{


    public IVA21(int numero, String concepto, double coste) {
        super(numero, concepto, coste);
    }
    @Override
    public double valor(){
        return  super.getCoste()*1.21;
    }

    @Override
    public double getIvaImporte() {
        return valor()+(super.getCoste()*0.30);
    }
}
