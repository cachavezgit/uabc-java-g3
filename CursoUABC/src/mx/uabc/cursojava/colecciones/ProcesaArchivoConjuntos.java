package mx.uabc.cursojava.colecciones;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProcesaArchivoConjuntos {
    public static void main(String[] args) throws Exception  {
        String path= "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\arrays\\lineas.txt";

        String[] lineasDelArchivo = new String[100];

        Scanner scanner = new Scanner(new File(path));

        Set<String> palabrasUnicas = new TreeSet<>();

        int linea = 0;
        while(scanner.hasNextLine()) {
            String palabras[] = scanner.nextLine().trim().split(" ");
            Collections.addAll(palabrasUnicas,palabras);
        }

        palabrasUnicas.forEach(laPalabra->System.out.println(laPalabra));
    }
}
