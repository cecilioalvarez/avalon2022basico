package es.avalon.objetos.ejemplo01;

public class Factura {
    // es una definicion de una clase a nivel general

    int numero;
    String concepto;
    double importe;
    // metodo
    double importeConIVA() {

        return importe*1.21;
    }

}
