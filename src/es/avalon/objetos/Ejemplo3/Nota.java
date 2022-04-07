package es.avalon.objetos.Ejemplo3;

public class Nota {
    private String asignatura;
    private int valor;

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
        this.valor = valor;
    }

    public void aprobado(){
        if(valor>=5){
            System.out.println("Has aprobado "+this.asignatura);
        }else {
            System.out.println("Has suspenso "+this.asignatura);
        }
    }
}
