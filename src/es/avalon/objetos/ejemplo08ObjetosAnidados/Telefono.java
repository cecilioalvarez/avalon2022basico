package es.avalon.objetos.ejemplo08ObjetosAnidados;

public class Telefono {

    private String marca;
    private int numero;

    public Telefono(String marca, int numero) {
        this.marca = marca;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
