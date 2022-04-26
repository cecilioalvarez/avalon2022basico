package Test.empresasFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectorFichero {
    private File fichero;

    public LectorFichero(File fichero) {
        this.fichero = fichero;
    }

    public List<String> leerlineas() throws  FileNotFoundException{
        List<String> valores = new ArrayList<String>();
        try ( Scanner sc= new Scanner(fichero);){
            if(sc.hasNextLine()){
                if(!(sc.nextLine().contains("empresa"))) return valores;
            }
            while (sc.hasNextLine()){
                String texto =sc.nextLine();
                System.out.println(texto);
                valores.add(texto);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return valores;
    }
}
