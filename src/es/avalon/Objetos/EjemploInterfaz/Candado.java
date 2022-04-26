package es.avalon.Objetos.EjemploInterfaz;

    public class Candado  implements Interfaz{


        @Override
        public void abrir() {
            System.out.println("el candado se abre");
        }

        @Override
        public void cerrar() {
            System.out.println("el candado se cierra");
        }
}
