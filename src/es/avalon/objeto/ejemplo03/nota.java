package es.avalon.objeto.ejemplo03;

public class nota {


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

    public void setnota(double nota) {
        if (nota< 0){
            this.nota = 0;
        }else if (nota > 10){
            this.nota = 10;
        }else {
        this.nota = nota;
    }

    }

    public boolean estaAprobado(){

        return nota>=5;
    }
}

