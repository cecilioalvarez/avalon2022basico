package es.avalon.jdbc2;

public class Principal {

    public static void main(String[] args) {

        Persona p = new Persona("50", "Angel", 20);

        PersonaRepository repository = new PersonaRepository();

        repository.insertar(p);


    }
}
