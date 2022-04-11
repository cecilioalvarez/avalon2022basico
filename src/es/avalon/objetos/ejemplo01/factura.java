package es.avalon.objetos.ejemplo01;

public class factura {
    int numero;
    String concepto;
    double importe;

    double importeConIva(){

        return importe*1.21;
    }
}
