package es.avalon.objetos.Ejemplo4;

public class Principal {
    public static void main(String[] args) {
        Nota n1 = new Nota("Matematicas",20);
//        n1.setAsignatura("Matematicas");
//        n1.setValor(20);

        n1.aprobado();
        System.out.println(n1.getValor());
    }
}
