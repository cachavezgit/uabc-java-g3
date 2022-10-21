package mx.uabc.cursojava.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface DemoAnnotation {
    String nombreProgramador();
    String descripcion();
}
