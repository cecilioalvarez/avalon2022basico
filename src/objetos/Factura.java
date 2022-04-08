package objetos;

public class Factura {

    int numero;
    double importe;
    String concepto;


    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        if (importe<=100) {
            this.importe = importe;
        }else {
            this.importe =100;
        }
    }


    double importeConIVA(){

        return importe*1.21;
    }
}
