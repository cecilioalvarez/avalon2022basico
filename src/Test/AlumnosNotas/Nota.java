package Test.AlumnosNotas;

import java.util.Objects;

public class Nota {
    private String Asignatura;
    private Double Valor;

    public Nota(String asignatura, Double valor) {
        Asignatura = asignatura;
        Valor = valor;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nota)) return false;
        Nota nota = (Nota) o;
        return Objects.equals(getAsignatura(), nota.getAsignatura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAsignatura());
    }

    public boolean esAprobado(){
        return Valor>=5;
    }
}
