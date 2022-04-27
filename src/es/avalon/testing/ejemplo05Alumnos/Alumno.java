package es.avalon.testing.ejemplo05Alumnos;

import org.mockito.internal.matchers.Not;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private List<Nota> notas = new ArrayList<>();

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void addNota(Nota nota) {
        notas.add(nota);
    }

    public void removeNota(Nota nota) {
        notas.remove(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public int notasAprobadas() {
        int total = 0;
        for (Nota n : notas) {
            if(n.esAprobado()) {
                total++;
            }
        }
        return total;
    }

    public double notaMedia(){
        int total = 0;
        for(Nota n : notas) {
            total+= n.getValor();
        }
        return  total/notas.size();
    }


}
