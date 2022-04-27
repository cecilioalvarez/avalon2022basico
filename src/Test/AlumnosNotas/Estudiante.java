package Test.AlumnosNotas;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String Nombre;
    private List<Nota> Notas;

    public Estudiante(String nombre) {
        Nombre = nombre;
        Notas = new ArrayList<>();
    }

    public void addNota(Nota n){
        this.Notas.add(n);
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setNotas(List<Nota> notas) {
        Notas = notas;
    }

    public List<Nota> getNotas() {
        return Notas;
    }
    public int notasAprobadas(){
        int total=0;
        for(Nota n: Notas){
            if (n.esAprobado()){
                total++;
            }
        }
        return total;
    }

    public double notasMayor(){
        double total=0;
        for(Nota n: Notas){
            if (n.esAprobado()){
                if(total<n.getValor()){
                    total=n.getValor();
                }
            }
        }
        return total;
    }

    public double notaMedia(){
        double total=0;
        int contador=0;
        for(Nota n: Notas){
            if (n.esAprobado()){
                total=total+n.getValor();
                contador++;
            }
        }
        return total/contador;
    }
    public void Delete(int pos){
        if(pos<=Notas.size() && pos>=0){
            Notas.remove(pos);
        }else{
            System.out.println("pos invalida");
        }
    }


}
