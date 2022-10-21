package mx.uabc.cursojava.filesystem;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Archivos {

    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("java.io.tmpdir");
        System.out.println(pathString);
        Path path = Paths.get(pathString);
        Stream<Path> fileNames = Files.list(path);
        fileNames.limit(5).forEach(System.out::println);

        pathString = System.getProperty("user.home");
        List<Path> subDirectories = Files.walk(Paths.get(pathString), 1)
                .filter(Files::isDirectory)
                .collect(Collectors.toList());
        for (int i = 0; i < 5; i++ ) {
            Path filePath = subDirectories.get(i);
            String fileType = Files.isDirectory(filePath) ? "Dir" : "Fil";
            System.out.println(fileType + " " + filePath);
        }

        path = Paths.get(System.getProperty("user.home"));

        Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                System.out.println(dir.toString());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.out.println("visitFileFailed: " + file);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
