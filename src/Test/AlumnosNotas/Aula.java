package Test.AlumnosNotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aula {
    private String numero;
    private List<Estudiante> estudiantes= new ArrayList<Estudiante>();

    public Aula(String nombre) {
        numero = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante est){
        estudiantes.add(est);
    }
    public double notaMediaAula(){
        double nota=0.0;
        for (Estudiante n:estudiantes   ) {
            nota=nota+n.notaMedia();
        }
    return nota/estudiantes.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aula)) return false;
        Aula aula = (Aula) o;
        return Objects.equals(getNumero(), aula.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }
}
