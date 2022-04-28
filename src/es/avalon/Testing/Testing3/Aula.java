package es.avalon.Testing.Testing3;

import java.util.ArrayList;
import java.util.List;


    public class Aula {
        private int numero;
        List<Alumno> alumnos= new ArrayList<>();

        public List<Alumno> getAlumnos() {
            return alumnos;
        }

        public void setAlumnos(List<Alumno> alumnos) {
            this.alumnos = alumnos;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public Aula(int numero) {
            this.numero = numero;
        }

        public void addAlumno(Alumno alum) {
            alumnos.add(alum);
        }

        public double notaMedia() {
            double total=0;
            for (Alumno a : alumnos) {

                total+= a.notaMedia();
            }
            return total/alumnos.size();
        }
}
