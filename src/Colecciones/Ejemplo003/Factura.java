package Colecciones.Ejemplo003;

public class Factura {
    private int numero;
    private String  concepto;
    private int valor;

    public Factura(int numero, String concepto, int valor) {
        this.numero = numero;
        this.concepto = concepto;
        this.valor = valor;
    }

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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
