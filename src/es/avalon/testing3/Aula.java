package es.avalon.testing3;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private int Numero;

    private List<Alumno> alumnos=new ArrayList<>();

    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }


    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public Aula(int numero) {
        Numero = numero;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public double notaMedia(){
        double total=0;
        for (Alumno a : alumnos) {

            total+= a.notaMedia();
        }
        return total/alumnos.size();
    }
}
