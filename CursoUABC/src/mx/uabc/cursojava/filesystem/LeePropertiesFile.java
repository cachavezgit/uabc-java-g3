package mx.uabc.cursojava.filesystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LeePropertiesFile {
    public static void PrintOutProperties(FileInputStream fileStream) throws IOException {
        Properties properties = new Properties();
        properties.load(fileStream);

        System.out.println("name: " + properties.getProperty("name"));
        System.out.println("family name: " + properties.getProperty("familyName"));
        System.out.println("nick: " + properties.getProperty("userName"));
        System.out.println("age: " + properties.getProperty("age"));
        System.out.println("background color: " + properties.getProperty("bgColor"));
    }

    public static void main(String[] args) throws IOException {
        String pathString = "C:\\Users\\cachavez\\curso-java\\CursoUABC\\src\\mx\\uabc\\cursojava\\filesystem\\demo.properties";

        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(pathString);
            PrintOutProperties(fileStream);
        } catch (FileNotFoundException fnfe) {
            System.out.println("WARNING: could not find the properties file");
        } catch (IOException ioe) {
            System.out.println("WARNING: problem processing the properties file");
        } finally {
            if (fileStream != null) {
                fileStream.close();
            }
        }

        File file = new File("c:");
        long totalSpace = file.getTotalSpace(); //total disk space in bytes.
        long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
        long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.

        System.out.println(" === Partition Detail ===");

        System.out.println(" === bytes ===");
        System.out.println("Total size : " + totalSpace + " bytes");
        System.out.println("Space free : " + usableSpace + " bytes");
        System.out.println("Space free : " + freeSpace + " bytes");

        System.out.println(" === mega bytes ===");
        System.out.println("Total size : " + totalSpace /1024 /1024 + " mb");
        System.out.println("Space free : " + usableSpace /1024 /1024 + " mb");
        System.out.println("Space free : " + freeSpace /1024 /1024 + " mb");
    }
}
