package Objetos.Ejemplo001;

public class Factura {
   int numero; //propiedades
   String concepto;
   double importe;
   public Factura(){//constructor

   }
   //funciones

   double importeConIVA(){//metodo get
      return importe*1.21;

   }

}
