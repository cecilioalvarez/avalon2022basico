package es.avalon.objetos.ejemplo14;

public class Main {
    public static void main(String[] args) {
        Nas nas1 = new Nas();
        nas1.setIdNas("Nas 1");
        nas1.addDisco(new DiscoDuro("Disco1", 1));
        nas1.addDisco(new DiscoDuro("Disco2", 3));
        nas1.addDisco(new DiscoDuro("Disco3", 5));
        nas1.addDisco(new DiscoDuro("Disco4", 2));

        Ordenador pc1 = new Ordenador(nas1);
        System.out.println(pc1.getNas().getIdNas());
        System.out.println(pc1.getNas().GetCapacidadTotal());


    }
}
