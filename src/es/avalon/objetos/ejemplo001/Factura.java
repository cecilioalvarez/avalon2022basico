package es.avalon.objetos.ejemplo001;

public class Factura {

    int numero;
    String concepto;
    double importe;

    //metodo IVA
    double importeIva(){
        return importe*1.21;
    }

}
