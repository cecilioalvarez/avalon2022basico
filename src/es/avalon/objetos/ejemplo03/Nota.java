package es.avalon.objetos.ejemplo03;

public class Nota {

        private String Asignatura;
        private double nota;

        public String getAsignatura() {

                return Asignatura;
        }

        public void setAsignatura(String asignatura) {

                Asignatura = asignatura;
        }

        public double getnota() {

                return nota;
        }

        public void setNota(double nota) {
                if (nota<0){
                        this.nota=0;
                }else if(nota>10){
                        this.nota=10;

                }else{
                        this.nota=nota;
                }

        }
        public boolean estaAprobada(){ return nota>=5; }
}
