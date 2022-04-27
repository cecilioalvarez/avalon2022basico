package es.avalon.testing.Ejemplo003;

import es.avalon.testing.Ejemplo003.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    private List<Alumno>alumnos=new ArrayList<>();
    private int numeroAula;

    public Aula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public double notaMediaAula(){
        double notaMedia=0;
        for (Alumno a:alumnos
             ) {notaMedia+=a.notaMedia();
            
        }return notaMedia/(alumnos.size());
    }
    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
}
