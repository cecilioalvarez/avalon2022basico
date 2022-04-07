package es.avalon.objetos.ejemplo02;

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

    public void setNota(double valor) {
        this.nota = valor;
    }

    //Metodo
    void Resultado() {
        if (nota >= 5) {
            System.out.println("La asignatura " + asignatura + " esta aprobada");
        } else {
            System.out.println("La asignatura " + asignatura + " esta suspendida");
        }
    }

    public boolean estaAprobada() {
        return nota >= 5;
    }
}
