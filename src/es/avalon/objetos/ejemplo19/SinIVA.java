package es.avalon.objetos.ejemplo19;

public class SinIVA extends Compra{
    @Override
    public double getPrecio(){
        return  getPrecio()*1.00;
    }