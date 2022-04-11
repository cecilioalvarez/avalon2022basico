package es.avalon.objetos.ejemplo07;

public class lamparatecho {

    private int bomb1;
    private int bomb2;
    private int bomb3;

    public int getBomb1() {
        return bomb1;
    }

    public void setBomb1(int bomb1) {
        this.bomb1 = bomb1;
    }

    public int getBomb2() {
        return bomb2;
    }

    public void setBomb2(int bomb2) {
        this.bomb2 = bomb2;
    }

    public int getBomb3() {
        return bomb3;
    }

    public void setBomb3(int bomb3) {
        this.bomb3 = bomb3;
    }
    public lamparatecho(int bomb1, int bomb2, int bomb3) {
        this.bomb1 = bomb1;
        this.bomb2 = bomb2;
        this.bomb3 = bomb3;
    }


    public int pTotal(){
        return getBomb1()+getBomb2()+getBomb3();

    }
}
