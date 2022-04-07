package Objetos.Ejemplo004;

public class Nota {

   private String Asignatura;
   private double nota;
    public Nota(String Asignatura,double nota){//constructor
       this.nota=nota;
       this.Asignatura="default";
   }
   public Nota(){

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
       if (nota<0){
          this.nota=0;
       }else if(nota>10){
         this.nota=10;
      } else{
          this.nota = nota;
       }

   }

   public String isAprobada(){
       if(nota>=6){
          return "Aprobada";
       }else{
          return "Suspendida";
       }

   }

}
