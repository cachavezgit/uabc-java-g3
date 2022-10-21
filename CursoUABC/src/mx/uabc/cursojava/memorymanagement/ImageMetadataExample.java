package mx.uabc.cursojava.memorymanagement;

public class ImageMetadataExample {
    public static void main(String[] args) {
        try {
            final String url =
                    "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\memorymanagement\\test.jpg";
            for (int i = 0; i < 2000; i ++) {
                Metadata metadata =
                        ImageMetadataUtils.getMetadataLocalFile(url);
                System.out.println(String.format("Count %d URL: %s, metadata: %s", i, url, metadata.toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
