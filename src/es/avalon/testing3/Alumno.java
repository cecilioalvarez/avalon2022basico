package es.avalon.testing3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private List<Nota> notas = new ArrayList<>();

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void addNota(Nota nota) {
        notas.add(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int notasAprobadas() {
        int total = 0;
        for (Nota n : notas) {
            if (n.esAprobado()) {
                total++;
            }
        }
        return total;
    }

    //Conseguimos la media de las notas
    public double notaMedia (){
        double total = 0.0;
        for (Nota n : notas) {
            total = total + n.getValor();
        }
        return total/notas.size();
    }

    public Nota mayorNota() {
        Nota inicial = notas.get(0);
        for (Nota nota : notas){

            if (inicial.getValor()<nota.getValor()){
                inicial=nota;
            }
        }
        return inicial;
    }

//    public double notaMayor() {
//        double mayor = 0;
//        for (Nota n : notas){
//            if (n.getValor() > mayor){
//                mayor = n.getValor();
//            }else {
//                return mayor;
//            }
//        }
//        return mayor;
//    }
}
