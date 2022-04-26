package es.avalon.Objetos.ejemplo001;

public class Factura {

    int numero;
    String concepto;
    double importe;

    //metodo IVA
    double importeIva(){
        return importe*1.21;
    }

}
