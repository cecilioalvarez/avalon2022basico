package es.avalon.objetos;

import java.util.Random;

import static es.avalon.objetos.Constant.DIEZ;

public class GenerateRandom {

    public static void Random(){
        Random rand = new Random();
        int upperbound = DIEZ;
        int int_random = rand.nextInt(upperbound);
    }
}
