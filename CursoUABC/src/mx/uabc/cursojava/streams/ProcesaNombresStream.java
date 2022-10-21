package mx.uabc.cursojava.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesaNombresStream {
    public static void main(String[] args) throws Exception{
        /*
        String path= "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\streams\\nombres.txt";
        Scanner scanner = new Scanner(new File(path));
        List<String> nombres = new ArrayList<>();
        while(scanner.hasNextLine()) {
            nombres.add(scanner.nextLine());
        }
        */
        //Stream<String> nombres =Files.lines(Path.of("C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\streams\\nombres.txt"));

        //Procesar una lista de 10 nombres que tengan un apellido con la letra C, E, G
        List<String> nombresCondicionCEG =
                Files.lines(Path.of("C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\streams\\nombres.txt"))
                .filter(n -> n.startsWith("C") || n.startsWith("E") || n.startsWith("G") )
                .distinct()
                .limit(30)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(nombresCondicionCEG);

    }
}
