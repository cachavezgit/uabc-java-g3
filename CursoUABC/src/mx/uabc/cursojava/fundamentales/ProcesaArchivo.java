package mx.uabc.cursojava.fundamentales;

import java.io.FileInputStream;
import java.util.Scanner;

public class ProcesaArchivo {
    public static void main(String args[]) throws Exception {
        String path = "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\fundamentales\\Lineas.txt";
        FileInputStream fis=new FileInputStream(path);

        Scanner scanner = new Scanner(fis);

        short longitudGanadora = 0;
        String lineaMasLarga= "";

        while(scanner.hasNextLine()) {
            String linea = scanner.nextLine();

            if (linea.length()>10) {
                System.out.println(linea);
                lineaMasLarga = (linea.length()>longitudGanadora)?linea:lineaMasLarga;
                longitudGanadora = (linea.length()>longitudGanadora)?(short) linea.length():longitudGanadora;
            }
        }

        //System.out.println("La linea más larga fue "+lineaMasLarga);
        System.out.println(String.format("La linea más larga: fue %s",lineaMasLarga.trim()));
        scanner.close();

    }
}
