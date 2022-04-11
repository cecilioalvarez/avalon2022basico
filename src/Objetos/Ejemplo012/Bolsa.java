package Objetos.Ejemplo012;

import java.util.ArrayList;

public class Bolsa {
   private  String Color;
   private int peso;
   ArrayList<Productos> pro = new ArrayList<Productos>();

   public void  add(Productos p){
       this.getPro().add(p);
   }

    public Bolsa(String color, int peso) {
        Color = color;
        this.peso = peso;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Productos> getPro() {
        return pro;
    }

    public void setPro(ArrayList<Productos> pro) {
        this.pro = pro;
    }

    public double total(){
       double total=0;
        for (int i = 0; i < this.getPro().size(); i++) {
            total=total+this.getPro().get(i).getPrecio();
        }
       return total;
    }
}
