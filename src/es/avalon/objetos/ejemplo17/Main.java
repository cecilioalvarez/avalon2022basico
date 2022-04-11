package es.avalon.objetos.ejemplo17;

public class Main {
    public static void main(String[] args) {
        Matematicas m = new Matematicas();
        m.sumar(2,3);
        m.restar(2,3);
        m.producto(2,3);
        m.division(2,3);
        System.out.println(m.sumar(4,7));
    }
}
