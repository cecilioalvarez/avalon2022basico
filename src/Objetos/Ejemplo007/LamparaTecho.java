package Objetos.Ejemplo007;

public class LamparaTecho {
    private int Bombilla1;
    private int Bombilla2;
    private int Bombilla3;

    public LamparaTecho(int bombilla1, int bombilla2, int bombilla3) {
        Bombilla1 = bombilla1;
        Bombilla2 = bombilla2;
        Bombilla3 = bombilla3;
    }

    public LamparaTecho() {
    }

    public int getBombilla1() {
        return Bombilla1;
    }

    public void setBombilla1(int bombilla1) {
        Bombilla1 = bombilla1;
    }

    public int getBombilla2() {
        return Bombilla2;
    }

    public void setBombilla2(int bombilla2) {
        Bombilla2 = bombilla2;
    }

    public int getBombilla3() {
        return Bombilla3;
    }

    public void setBombilla3(int bombilla3) {
        Bombilla3 = bombilla3;
    }

    public int total(){
        return Bombilla1+Bombilla2+Bombilla3;
    }
}
