package es.avalon.testing3;


import java.util.Objects;

public class Nota {

    private String asignatura;
    private double valor;

    public Nota(String asignatura, double valor) {
        this.asignatura = asignatura;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nota)) return false;
        Nota nota = (Nota) o;
        return Double.compare(nota.valor, valor) == 0 && Objects.equals(asignatura, nota.asignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asignatura, valor);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    // yo puedo querer testear
    public boolean  esAprobado() {
        return valor>=5;
    }
}
