package es.avalon.Testing.Testing3;

import java.util.Objects;

public class Nota {

    private String asignatura;
    private Double calificacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return Objects.equals(asignatura, nota.asignatura) && Objects.equals(calificacion, nota.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asignatura, calificacion);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Nota(String asignatura, Double calificacion) {
        this.asignatura = asignatura;
        this.calificacion = calificacion;
    }

    public boolean esAprobado(){
        return calificacion >=5;
    }

}
