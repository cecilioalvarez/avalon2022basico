package es.avalon.objetos.ejemplo002;

public class Nota {

    private String asignatura;
    private int valor;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor<0){
            this.valor=0;
        } else if (valor>10){
            this.valor=10;
        } else this.valor=valor;
    }

    public boolean estaAprobada(){
        return valor>=5;
    }
}
