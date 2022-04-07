package es.avalon.objetos.EjemploObjetos001;

public class Factura {
    int numero;
    String concepto;
    double importe;

    double importeConIVA(){
        return importe *1.21;
    }
}
