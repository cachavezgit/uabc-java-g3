package mx.uabc.cursojava.arrays;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProcesaLineasArchivo {
    public static void main(String[] args) throws Exception {
        String path= "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\arrays\\lineas.txt";

        String[] lineasDelArchivo = new String[100];

        Scanner scanner = new Scanner(new File(path));

        int linea = 0;
        while(scanner.hasNextLine()) {
            lineasDelArchivo[linea++] = scanner.nextLine().trim();
        }

        scanner.close();
        /*Arrays.sort(lineasDelArchivo, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1!=null && o2!=null) {
                    return o1.compareTo(o2);
                }
                return (o1==o2)?0:(o1==null)?1:-1;
            }
        });*/

        Arrays.sort(lineasDelArchivo,Comparator.nullsFirst(Comparator.naturalOrder()));

        for (String lineaLeida:lineasDelArchivo) {
            System.out.println(lineaLeida);
        }

    }
}
