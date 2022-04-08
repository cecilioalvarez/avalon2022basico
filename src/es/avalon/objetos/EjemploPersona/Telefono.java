package es.avalon.objetos.EjemploPersona;

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

   public Telefono(int numero, String marca){
        this.marca=getMarca();
        this.numero=getNumero();
   }

}
