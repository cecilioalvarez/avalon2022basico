package es.avalon.objetos.Ejemplo4;

public class Nota {
    private String asignatura;
    private int valor;



    public Nota(String asignatura, int valor) {
        setAsignatura(asignatura);
        setValor(valor);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor > 10) {
            this.valor = 10;
        } else if (valor < 0) {
            this.valor = 0;
        } else {
            this.valor = valor;
        }
    }

    public void aprobado() {
        if (valor >= 5) {
            System.out.println("Has aprobado " + this.asignatura);
        } else {
            System.out.println("Has suspenso " + this.asignatura);
        }
    }
}
