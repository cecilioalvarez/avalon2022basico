package es.avalon.objetos.EjemploSobrecarga;

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

    //Aumenta la encapsulacion
    public void setImporte(double importe) {
        if(importe<=100){
            this.importe=importe;
        }else{
            this.importe=100;
        }
    }


    double importeIva(){
        return importe*1.21;
    }

    //Metodo sobrecargado
    double importeIva(int porcentaje){

        return importe+importe*porcentaje/100;
    }
}
