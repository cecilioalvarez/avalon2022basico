package Objetos.Ejemplo005;

public class Factura {
   private int numero; //propiedades
   private String concepto;
   private double importe;
    public Factura(){//constructor

   }
   //funciones

   double importeConIVA(){//metodo get
      return importe*1.21;

   }
   double importeConIVA(double porcentaje){//metodo get
      return importe+importe*porcentaje/100;

   }

   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   public String getConcepto() {
      return concepto;
   }

   public void setConcepto(String concepto) {
      this.concepto = concepto;
   }

   public double getImporte() {
      return importe;
   }

   public void setImporte(double importe) {
      this.importe = importe;
   }
}
