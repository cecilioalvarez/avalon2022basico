package es.avalon.objetos.ejemplo03Constructores;

public class Nota {

    private String asignatura;
    private double nota;

    //LLamarse igual a la funcion es la que la identifica como funcion de construccion del objeto
    public Nota(String asignatura, double nota) {
        setAsignatura(asignatura);
        setNota(nota);
    }

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
