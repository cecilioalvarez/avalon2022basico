package Objetos.Ejemplo003;

public class Nota {

   private String Asignatura;
   private double nota;
    public Nota(){//constructor

   }

   public String getAsignatura() {
      return Asignatura;
   }

   public void setAsignatura(String asignatura) {
      Asignatura = asignatura;
   }

   public double getNota() {
      return nota;
   }

   public void setNota(double nota) {
      this.nota = nota;
   }

   public String isAprobada(){
       if(nota>=6){
          return "Aprobada";
       }else{
          return "Suspendida";
       }

   }

}
