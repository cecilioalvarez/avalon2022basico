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
        pc1.getNas().recorrerNas();
        System.out.println(pc1.getNas().GetCapacidadTotal());


    }
}
    /*public interface Stringable {
        String convertToString();

        *//*
          Devuelve la suma de los dos numeros
          @param num1 numero 1
         * @param num2 numero 2
         * @return la suma
         *//*
        int suma(int num1, int num2);
    }

    class Foo implements Stringable {
        int contador = 0;
        String titulo = "Fooo";

        @Override
        public String convertToString() {
            return "Contador: " + contador + ", Titulo: " + titulo;
        }

        @Override
        public int suma(int num1, int num2) {
            return num1 + num2;
        }
    }

    class ASDF implements Stringable {

        @Override
        public String convertToString() {
            return "Hola mundo";
        }

        @Override
        public int suma(int num1, int num2) {
            return Math.addExact(num1, num2);
        }

    }

    class ASDFGH extends ASDF {
        @Override
        public String convertToString() {
            return "Lorem ipsum";
        }
    }

    class Bar {
        public String convert(Stringable string) {
            return string.convertToString();
        }

        public void main(String[] args) {
            Foo foo = new Foo();
            ASDF asdf = new ASDF();

            convert(foo);
            convert(asdf);

            foo.suma(1, 2);
            asdf.suma(1, 2);
        }
    }
}*/
