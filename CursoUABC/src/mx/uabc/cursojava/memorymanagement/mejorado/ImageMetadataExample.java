package mx.uabc.cursojava.memorymanagement.mejorado;

import mx.uabc.cursojava.memorymanagement.Metadata;

public class ImageMetadataExample {

    public static void main(String[] args) {
        try {
            // This application runs very fast and difficult to monitor so, I will sleep in 10 seconds.
            System.out.println("Sleep in 10 seconds");
            Thread.sleep(10000);
            final String url = "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\memorymanagement\\test.jpg";;
            for (int i = 0; i < 200000; i ++) {
                Metadata metadata = ImageMetadataUtils.getMetadata(url);
                System.out.println(String.format("Count %d URL: %s, metadata: %s", i, url, metadata.toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}