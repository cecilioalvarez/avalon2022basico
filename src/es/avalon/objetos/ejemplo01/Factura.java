package es.avalon.objetos.ejemplo01;

public class Factura {
    //definicion de una clase a nivel general

    int numero;
    String concepto;
    double importe;
    //metodo que no recibe parametro pero devuelve un valor
    double importeConIVA(){

        return importe*1.21;
    }
}
