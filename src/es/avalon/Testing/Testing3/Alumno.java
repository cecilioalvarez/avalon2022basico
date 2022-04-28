package es.avalon.Testing.Testing3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    public List<Nota> notas = new ArrayList<>();
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void addNota(Nota nota){
        notas.add(nota);
    }
    
    public int notasAprobadas(){
        int total=0;
        for(Nota n: notas){
            if(n.esAprobado()){
                total++;
            }
        }
        return total;
    }

    public double notaMedia() {
        double total=0;
        for (Nota n : notas) {
            total+=n.getCalificacion();
        }
        return total/notas.size();
    }

    public double notaMasAlta(){
        double alta=0.0;
        for(Nota n:notas){
            if (n.getCalificacion() >= alta){
                alta = n.getCalificacion();
            }
        }
        return alta;
    }

    public double notaMasBaja(){
        double baja=10.0;
        for(Nota n:notas){
            if (n.getCalificacion() <= baja){
                baja = n.getCalificacion();
            }
        }
        return baja;
    }
}
