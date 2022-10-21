package mx.uabc.cursojava.concurrency.sincronizado;

public class CounterUser {
    public static void main(String args[]) {
        Counter counterA = new Counter();
        //Counter counterB = new Counter();
        Thread threadUno = new CounterThread(counterA);
        Thread threadDos = new CounterThread(counterA);

        threadUno.start();
        try {
            threadUno.wait(5000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        threadDos.start();

    }
}
