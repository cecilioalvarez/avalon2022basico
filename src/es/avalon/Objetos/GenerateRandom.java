package es.avalon.Objetos;

import java.util.Random;

import static es.avalon.Objetos.Constant.DIEZ;

public class GenerateRandom {

    public static void Random(){
        Random rand = new Random();
        int upperbound = DIEZ;
        int int_random = rand.nextInt(upperbound);
    }
}
