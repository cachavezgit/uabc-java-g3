package mx.uabc.cursojava.colecciones;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class InfoPalabra {
    private String palabra;
    private int numeroDeVeces;

    public InfoPalabra(String palabra, int numeroDeVeces) {
        this.palabra = palabra;
        this.numeroDeVeces = numeroDeVeces;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getNumeroDeVeces() {
        return numeroDeVeces;
    }

    public void setNumeroDeVeces(int numeroDeVeces) {
        this.numeroDeVeces = numeroDeVeces;
    }

    @Override
    public String toString() {
        return "InfoPalabra{" +
                "palabra='" + palabra + '\'' +
                ", numeroDeVeces=" + numeroDeVeces +
                '}';
    }
}
public class PalabrasRepetidasArchivoMapa {
    public static void main(String args[]) throws Exception {
        String path= "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\arrays\\lineas.txt";

        String[] lineasDelArchivo = new String[100];
        Scanner scanner = new Scanner(new File(path));

        Map<String, InfoPalabra> mapaInfoPalabras = new HashMap<>();

        while(scanner.hasNext()) {
            String linea = scanner.nextLine();
            String[] palabras = linea.split(" ");
            for(String palabra:palabras) {
                if (mapaInfoPalabras.containsKey(palabra)) {
                    InfoPalabra infoPalabra = mapaInfoPalabras.get(palabra);
                    int numeroDeVeces = infoPalabra.getNumeroDeVeces();
                    infoPalabra.setNumeroDeVeces(++numeroDeVeces);
                    mapaInfoPalabras.put(palabra,infoPalabra);
                } else {
                    mapaInfoPalabras.put(palabra,new InfoPalabra(palabra,1));
                }
            }
        }
        scanner.close();

        System.out.println(mapaInfoPalabras);

    }
}
