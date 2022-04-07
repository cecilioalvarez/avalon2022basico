package es.avalon.objetos.Ejemplo3;

public class Principal {
    public static void main(String[] args) {
        Nota n1=new Nota();
        n1.setAsignatura("Matematicas");
        n1.setValor(7);

        n1.aprobado();
    }
}
