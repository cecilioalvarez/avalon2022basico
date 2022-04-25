package es.avalon.EjemplosPropios.ejemplo1;

public class Coche implements Imprimible {
    private int numeroPuertas;
    private String matricula;
    private String modelo;

    public Coche(int numeroPuertas, String matricula, String modelo) {
        this.numeroPuertas = numeroPuertas;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getTexto() {
        return "Numero de puertas: "+ this.getNumeroPuertas()+ ", Matricula: "+ this.getMatricula()+ ", Modelo: "+this.getModelo();
    }
}
