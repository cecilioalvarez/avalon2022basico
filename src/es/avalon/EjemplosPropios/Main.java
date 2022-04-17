package es.avalon.EjemplosPropios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Casa monchusHouse = new Casa(5, 8, "Castañera", true, 85);
        Coche cocheCris = new Coche(5, "5894J", "Getz");
        Persona cris = new Persona ("Cris", "Puerto", "53854030J");
        Imprimible[] imprimibles = new Imprimible[] { monchusHouse, cocheCris, cris };

        for (Imprimible imprimible: imprimibles) {
            imprimir(imprimible);
            Guardar(imprimible);
        }
    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.getTexto());
    }
    public static void Guardar (Imprimible imprimible){
        try {
            File nuevoArchivo = File.createTempFile("imprimible", ".txt");
            FileWriter writer = new FileWriter(nuevoArchivo);
            writer.write(imprimible.getTexto());
            System.out.println(nuevoArchivo.getAbsolutePath());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
