package es.avalon.objetos.ejemplo07;

public class LamparaTecho {
    public int getBombilla1() {
        return bombilla1;
    }

    public void setBombilla1(int bombilla1) {
        this.bombilla1 = bombilla1;
    }

    public int getBombilla2() {
        return bombilla2;
    }

    public void setBombilla2(int bombilla2) {
        this.bombilla2 = bombilla2;
    }

    public int getBombilla3() {
        return bombilla3;
    }

    public void setBombilla3(int bombilla3) {
        this.bombilla3 = bombilla3;
    }

    public LamparaTecho(int bombilla1, int bombilla2, int bombilla3) {
        this.bombilla1 = bombilla1;
        this.bombilla2 = bombilla2;
        this.bombilla3 = bombilla3;
    }

    public int potenciatotalbombillas(){
        return bombilla1+bombilla2+bombilla3;
    }
    private int bombilla1;
    private int bombilla2;
    private int bombilla3;
}
