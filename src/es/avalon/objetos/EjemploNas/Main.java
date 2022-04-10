package es.avalon.objetos.EjemploNas;

import java.util.ArrayList;
import java.util.Random;

import static es.avalon.objetos.Constant.CERO;
import static es.avalon.objetos.Constant.UNO;

public class Main {
    public static void main(String[] args) {

        Random genNas=new Random();
        int nNas = genNas.nextInt(9)+UNO;
        int idDisco = CERO;
        Nas nas=new Nas();

        for(int y=0; y<nNas; y++) {
            idDisco++;
            Random r = new Random();
            int capacidad = r.nextInt(19)+UNO;
            nas.addDisco(new Disco(idDisco, capacidad));
        }
        System.out.println("\n");

        ArrayList<Disco> raid = nas.getDisco();
        int totalCap=0;

        for (int x=0; x<raid.size();x++) {
            if(raid.get(x).getIdDisco() != CERO && raid.get(x).getCapacidad() != CERO){
                totalCap=totalCap+raid.get(x).getCapacidad();
                System.out.println("El disco: " + raid.get(x).getIdDisco() + " Tiene una capacidad de: " + raid.get(x).getCapacidad() + "TB");
            }
        }
        System.out.println("\n La capacidad total del Nas es de: " + totalCap + "TB");


        Random numPc = new Random();
        int nPc = numPc.nextInt(9) + UNO;
        Ordenador pc=new Ordenador();
        pc.setIdOrdenador(nPc);

            if(pc.getIdOrdenador()<=CERO || pc.getIdOrdenador() > raid.size()){
            pc.desconectado();
            }else pc.conectado();


    }
}
