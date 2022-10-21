package mx.uabc.cursojava.annotations;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

@DemoAnnotation(nombreProgramador = "Carlos Ivan Chavez Fuentes",
        descripcion = "Demostrar el uso de anotaciones")
public class UsoAnnotations {
    public static void main(String args[]) throws Exception {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        Class<?> clazz;

        Scanner c = new Scanner(new File("c:\\test.txt"));
        clazz = c.getClass();
        for(Method m:clazz.getMethods()) {
            System.out.println(m.getName());
        }

        clazz = class1.getClass();
        if (clazz.isAnnotationPresent(JsonSerializable.class)) {
            System.out.println(
                    String.format("La clase %s tiene aplicada la anotacion JsonSerializable",
                        class1.getClass().getName()));
        }

        clazz = class2.getClass();
        if (clazz.isAnnotationPresent(JsonSerializable.class)) {
            System.out.println(
                    String.format("La clase %s tiene aplicada la anotacion JsonSerializable",
                            class2.getClass().getName()));
        }


    }

}
