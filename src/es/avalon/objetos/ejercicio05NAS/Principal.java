package es.avalon.objetos.ejercicio05NAS;

public class Principal {

    public static void main(String[] args) {

        DiscoDuro d1 = new DiscoDuro("Samsung", 2);
        Ordenador o = new Ordenador(d1);
        NAS minas= new NAS();

        minas.addDisco(new DiscoDuro("Seagate", 2));
        minas.addDisco(new DiscoDuro("Seagate", 2));
        minas.addDisco(new DiscoDuro("Seagate", 2));
        minas.addDisco(new DiscoDuro("Seagate", 2));
        minas.addDisco(new DiscoDuro("Seagate", 2));

        o.conectarNAS(minas);
        System.out.println(o.capacidadDisco());

    }
}
