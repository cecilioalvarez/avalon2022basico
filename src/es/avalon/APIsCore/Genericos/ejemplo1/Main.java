package es.avalon.APIsCore.Genericos.ejemplo1;

public class Main {

    public static void main(String[] args) {

        Galleta g1 = new Galleta("Chocolate");
        Galleta g2 = new Galleta("Vainilla");
        Galleta g3 = new Galleta("Fresa");

        Caja<Galleta> cajaGalletas= new Caja<Galleta>(2);
        cajaGalletas.add(g1);
        cajaGalletas.add(g2);
        cajaGalletas.add(g3);

        for (Galleta g: cajaGalletas.getLista()){
            System.out.println(g.getSabor());
        }
        Caja<Bombones> cajaBombones = new Caja<Bombones>(5);

        cajaBombones.add(new Bombones("normal"));
        // Al declararse el tipo generico como bombon,
        // no se puede declarar otros elementos dentro

        // ->  cajaBombones.add(new Galletas("chocolate"));


    }
}
