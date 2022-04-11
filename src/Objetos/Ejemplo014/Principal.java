package Objetos.Ejemplo014;

public class Principal {
    public static void main(String[] args) {
        Disco d = new Disco("samsung",2);
        Ordenador r = new Ordenador(d);
        NAS n = new NAS();
        n.add(new Disco("seagate", 2));
        n.add(new Disco("seagate", 2));
        n.add(new Disco("seagate", 2));
        n.add(new Disco("seagate", 2));
        n.add(new Disco("seagate", 2));
        n.add(new Disco("seagate", 2));
        n.add(new Disco("seagate", 2));
        //r.add_disco_nas(new Disco("seagate", 2));
       r.conectarNas(n);
        System.out.println(r.capacidadDisco());
    }

}
