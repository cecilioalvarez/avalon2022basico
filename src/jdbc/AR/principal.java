package jdbc.AR;

public class principal {
    public static void main(String[] args) {
        personaAddRecord ar = new personaAddRecord("10359756G","ANDRES","SANCHEZ");
       // ar.insertar();
        for( personaAddRecord p : ar.buscarTodos()){
            System.out.println(p.getDni()+" "+p.getNombre()+" "+p.getApellido());
        }

        CompraAddRecord cr = new CompraAddRecord(3,"2022-05-04","Tablet",300,ar,1);
        //cr.insertar();
        cr.borrar();
//        for(CompraAddRecord c: cr.buscarTodos()){
//            System.out.println(c.getConcepto());
//        }
    }
}
