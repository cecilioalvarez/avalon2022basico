package es.avalon.objetos.EjemploNas;

import es.avalon.objetos.GenerateRandom;

import java.util.ArrayList;
import java.util.Random;

import static es.avalon.objetos.Constant.CERO;
import static es.avalon.objetos.Constant.DIEZ;

public class Main {
    public static void main(String[] args) {

        Nas nas=new Nas();
        nas.addDisco(new Disco(1,5));
        nas.addDisco(new Disco(2,10));
        nas.addDisco(new Disco(3,0));
        nas.addDisco(new Disco(4,2));
        nas.addDisco(new Disco(5,4));

        System.out.println("\n");

        ArrayList<Disco> raid = nas.getDisco();
        for (int x=0; x<raid.size();x++) {
            if(raid.get(x).getIdDisco() != CERO && raid.get(x).getCapacidad() != CERO){
                //nas.discoON();
                System.out.println("El disco: " + raid.get(x).getIdDisco() + " Tiene una capacidad de: " + raid.get(x).getCapacidad() + "TB");
            } //else nas.discoOff();
        }



        Ordenador pc=new Ordenador();
        pc.setIdOrdenador(7);
            if(pc.getIdOrdenador()<=CERO && pc.getIdOrdenador() > raid.size()){
                pc.conectado();
        }else pc.desconectado();


    }
}
