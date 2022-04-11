package es.avalon.objetos.ejemplo03;

public class Nota {
        private String asignatura;
        private double nota;

        public String getAsignatura() {
            return asignatura;
        }

        public void setAsignatura(String asignatura) {
            this.asignatura = asignatura;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            if (nota < 0) {
                this.nota = 0;
            } else if (nota > 10) {
                this.nota = 10;
            } else {
                this.nota = nota;
            }

        }

        public boolean estaAprobada() {
            return nota >= 5;
        }
}
