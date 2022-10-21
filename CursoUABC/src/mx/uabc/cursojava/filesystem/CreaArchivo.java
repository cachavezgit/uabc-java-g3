package mx.uabc.cursojava.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreaArchivo {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp/";
        Path pathDirectory = Paths.get(pathString);
        if (Files.exists(pathDirectory)) {
            System.out.println("WARNING: directory exists already at: " +
                    pathString);
        } else {

        }
        try {
            // Create the directory
            Files.createDirectories(pathDirectory);
            System.out.println("New directory created at: " + pathString);
        } catch (IOException ioe) {
            System.out.println("Could not create the directory");
            System.out.println("EXCEPTION: " + ioe.getMessage());
        }

        Path pathFile = Paths.get(pathString);


        if (Files.exists(pathFile)) {
            pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";
            pathFile = Paths.get(pathString);
            String text = "Hola,\nme da un refresco,\npor favor?";

            if (Files.exists(pathFile)) {
                try {
                    Files.write(pathFile, Arrays.asList(text), StandardOpenOption.TRUNCATE_EXISTING);
                    System.out.println("Text added to the file: " + pathFile);
                } catch (IOException ioe) {
                    System.out.println("EXCEPTION: " + ioe.getMessage());
                }

                try {
                    List<String> fileContent = Files.readAllLines(pathFile);
                    for (String content : fileContent) {
                        System.out.println(content);
                    }
                } catch (IOException ioe) {
                    System.out.println("WARNING: there was an issue with the file");
                }
            }

        }
    }
}
