package mx.uabc.cursojava.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ContarNombresEnArchivoStream{
    public static void main(String args[])  throws java.io.IOException {
        Map<String,Long> mapaNombres =
                Files.lines(Path.of("C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\streams\\nombres.txt"))
                        .collect(Collectors.groupingBy(String::toUpperCase, TreeMap::new, Collectors.counting()));

        System.out.println(mapaNombres);

        mapaNombres.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                                TreeMap::new, Collectors.toList()))
                .forEach((letter, wordList) ->
                {
                    System.out.printf("%n%C%n", letter);
                    wordList.stream().forEach(word -> System.out.printf(
                            "%13s: %d%n", word.getKey(), word.getValue()));
                });

    }
}
