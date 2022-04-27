package es.avalon.testing.ejemplo05Alumnos;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    private int numero;
    private List<Alumno> alumnoList = new ArrayList<>();


    public Aula(Integer numero) {
        this.numero = numero;
    }

    public void addAlumno(Alumno alumno){
        alumnoList.add(alumno);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public Double notaMediaAlumnos(){

        double total = 0;

        for(Alumno alumno :  alumnoList) {
            total += alumno.notaMedia();
        }

        return total/alumnoList.size();
    }
}
