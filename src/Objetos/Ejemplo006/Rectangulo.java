package Objetos.Ejemplo006;

public class Rectangulo {

   private double lado2;
   private double lado1;
   public Rectangulo(){//constructor

   }

   public Rectangulo(double lado2, double lado1) {
      this.lado2 = lado2;
      this.lado1 = lado1;
   }
   //funciones

   public double getLado2() {
      return lado2;
   }

   public void setLado2(double lado2) {
      this.lado2 = lado2;
   }

   public double getLado1() {
      return lado1;
   }

   public void setLado1(double lado1) {
      this.lado1 = lado1;
   }
   public  double area(){
      return lado1*lado2;
   }
   public  double perimetro(){
      return (lado1*2)+(2*lado2);
   }
}
