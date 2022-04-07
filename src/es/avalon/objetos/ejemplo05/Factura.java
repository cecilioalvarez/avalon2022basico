package es.avalon.objetos.ejemplo05;

public class Factura {

    //Definicion de una clase a nivel general
    private int numero;
    private String concepto;
    private double importe;

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
        //CONCEPTO DE THIS
        //Iguala el concepto de la clase (this.concepto) con el que le pasamos por el metodo (String concepto)
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }


    public void setImporte(double importe) {
        // ENCAPSULACION
        // Aumentamos la encapsulacion por que reduce lo que podemos hacer
        if(importe<100){
            this.importe = importe;
        }else{
            this.importe=100;
        }
    }

    //Metodo
    double importeConIVA() {
        return importe * 1.21;
    }

    //Sobrecarga de metodos
    double importeConIVA(int porcentaje) {
        //Accedemos a la variable privada y calculamos un valor con ella
        //Que retornaremos
        return importe + importe*porcentaje/100;
    }
}
