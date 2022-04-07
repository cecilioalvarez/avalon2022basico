package es.avalon.objetos.EjemploObjetos003;

public class Nota {
    private String asignatura;
    private double valor;

    public Nota(String asignatura, double nota){
        this.asignatura = asignatura;
        this.valor = valor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void Aprobado(){
        if (valor >= 5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobo");
        }
    }
}
