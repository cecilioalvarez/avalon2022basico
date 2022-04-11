package es.avalon.objetos.ejemplo11Polimorfismo;

//Concepto de abstraccion es sacar un factor comun de ciertas propiedades
//Al hacer abstracta la clase coche no podremos crear objetos de este, pero si usar sus funcionalidades
public abstract class Coche {

    public abstract void girar();
    public abstract void cambiarMarcha();
}
