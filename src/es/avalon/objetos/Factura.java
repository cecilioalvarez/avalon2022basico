package es.avalon.objetos;

public class Factura {

    private String concepto;
    private double importe;
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }



    //metodo IVA
    double importeIva(){
        return importe*1.21;
    }

}
