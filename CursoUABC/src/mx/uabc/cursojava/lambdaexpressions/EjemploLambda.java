package mx.uabc.cursojava.lambdaexpressions;

public class EjemploLambda {
    public static void ejemplo1(String args[]){
        new Thread(new Runnable() {
            @Override
            public void run() {
                // lo que se va a ejecutar en un thread separado
            }
        }).start();
    }

    public static void ejemplo2(String args[]){
        new Thread(() -> {
            // lo que se va a ejecutar en un thread separado
        }).start();
    }




}
