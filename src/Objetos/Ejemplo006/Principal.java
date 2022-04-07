package Objetos.Ejemplo006;

import Objetos.Ejemplo005.Factura;

public class Principal {
    public static void main(String[] args) {
       Rectangulo r = new Rectangulo(10,5);
        System.out.println("área: "+r.area());
        System.out.println("perímetro: "+r.perimetro());
    }
}
