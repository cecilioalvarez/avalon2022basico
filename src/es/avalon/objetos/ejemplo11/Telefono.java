package es.avalon.objetos.ejemplo11;

public class Telefono {
    private String marca;
    private int numero;

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

    public Telefono(String marca, int numero) {
       setMarca(marca);
       setNumero(numero);
    }
}
