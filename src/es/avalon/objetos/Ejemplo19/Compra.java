package es.avalon.objetos.Ejemplo19;

public abstract class Compra<getImporte> {
    private double importe;
    private String concepto;
    private int ncompra;



    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getNcompra() {
        return ncompra;
    }

    public void setNcompra(int ncompra) {
        this.ncompra = ncompra;
    }

    public Compra(double importe, String concepto, int ncompra) {
        this.importe = importe;
        this.concepto = concepto;
        this.ncompra = ncompra;
    }

    public double getImporte() {
        return importe;
    }

    public abstract double getImporte1();
}
