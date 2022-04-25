package es.avalon.EjemplosPropios.ejemplo2GenericosConInterfaces;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();

        Enemigo orco = new Enemigo("Orco1", 10);
        Enemigo nazguul = new Enemigo("Nazguul", 315);

        HUDHP<Jugador> hudJugador = new HUDHP<Jugador>(jugador1);
        hudJugador.mostrarVida();
        hudJugador.recibirAtaque(orco);

        HUDHP<Unit> hudOrco = new HUDHP<Unit>(orco);
        hudOrco.recibirAtaque(nazguul);

        mostrar(hudJugador);
    }

    public static void mostrar(HUDHP<Jugador> hudJugador) {
        mostrarPuntuacion(hudJugador.getUnit());
    }

    public static void mostrarPuntuacion(Jugador jugador) {
        System.out.println("La puntuación es: " + jugador.getPuntuacion());
    }
}
