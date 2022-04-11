package es.avalon.objeto.ejemplo01;
// es una definicion de una clase a nivel general
public class factura {
    int numero;
    String concepto;
    double importe;
    //metodo
    double importeConIVA() {

        return importe*1.21;
    }
}
