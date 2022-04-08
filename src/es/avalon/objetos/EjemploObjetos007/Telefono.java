package es.avalon.objetos.EjemploObjetos007;

public class Telefono {
    private String marca;
    private int numero;
    private Telefono telefono;

    public Telefono(String marca, int numero, Telefono telefono) {
        this.marca = marca;
        this.numero = numero;
        this.telefono = telefono;
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
