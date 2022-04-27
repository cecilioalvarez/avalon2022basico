package es.avalon.testing3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Nota> misNotas = new ArrayList<>();
        Nota nota1 = new Nota("Matematicas", 6);
        Nota nota2 = new Nota("Lenguaje", 7);
        Nota nota3 = new Nota("Quimica", 9);

        misNotas.add(nota1);
        misNotas.add(nota2);
        misNotas.add(nota3);

    }
}
