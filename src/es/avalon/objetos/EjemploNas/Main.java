package es.avalon.objetos.EjemploNas;

import java.util.ArrayList;
import java.util.Random;

import static es.avalon.objetos.Constant.*;

public class Main {
    public static void main(String[] args) {

        Random genNas=new Random();
        int nNas = genNas.nextInt(DIEZ)+UNO;
        int idDisco = CERO;
        Nas nas=new Nas();

        for(int y=CERO; y<nNas; y++) {
            idDisco++;
            Random r = new Random();
            int capacidad = r.nextInt(DIEZ)+UNO;
            nas.addDisco(new Disco(idDisco, capacidad));
        }
        System.out.println("\n");

        ArrayList<Disco> raid = nas.getDisco();
        int totalCapacidad=CERO;

        for (int x=CERO; x<raid.size();x++) {
                totalCapacidad=totalCapacidad+raid.get(x).getCapacidad();
                System.out.println("El disco: " + raid.get(x).getIdDisco() + " Tiene una capacidad de: " + raid.get(x).getCapacidad() + "TB");
        }
        System.out.println("\n La capacidad total del Nas es de: " + totalCapacidad + "TB");


        Random numPc = new Random();
        int nPc = numPc.nextInt(DIEZ) + UNO;
        Ordenador pc=new Ordenador();
        pc.setIdOrdenador(nPc);

            if(pc.getIdOrdenador() > raid.size()){
            pc.desconectado();
            }else pc.conectado();


    }
}
