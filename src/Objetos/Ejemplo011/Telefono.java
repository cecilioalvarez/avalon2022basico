package Objetos.Ejemplo011;

public class Telefono {
    private String marca;
    private long numero;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Telefono() {
    }

    public Telefono(int numero) {
        this.numero = numero;
    }

    public Telefono(String marca, int numero) {
        this.marca = marca;
        this.numero = numero;
    }
}
