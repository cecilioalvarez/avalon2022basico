package jdbc.AR;

public class principal {
    public static void main(String[] args) {
        personaAddRecord ar = new personaAddRecord("10359756G","ANDRES","SANCHEZ");
      //  ar.insertar();
      // ar.setApellido("sanchez");
      // ar.modificar();
        ar.borrar();
       // ar = ar.buscaruno("2");
      //  System.out.println(ar.getDni()+" "+ar.getNombre()+" "+ar.getApellido());

        for( personaAddRecord p : ar.buscarTodos()){
            System.out.println(p.getDni()+" "+p.getNombre()+" "+p.getApellido());
        }

    }
}
