package es.avalon.objetos.ejemplo08;

public class lamparatecho {

    private int [] bombs;

    public int [] getBombs() {
        return bombs;
    }

    public void setBombs(int [] bombs) {
        this.bombs = bombs;
    }

    public void setBomb(int posc, int potn ){
        if (posc>=0 && posc<bombs.length)
            this.bombs[posc]=potn;
    }
    public lamparatecho(int numeroBombillas, int potenciaBombilla){
        bombs= new int[numeroBombillas];
        for (int i=0; i<bombs.length;i++){
            bombs[i]=potenciaBombilla;
        }
    }

    int pTotal(){
        int total=0;
        for (int i=0;i< bombs.length;i++){
            total+=bombs[i];
        }
        return total;
    }

}
