package mx.uabc.cursojava.concurrency;

public class MyRunnableUser {
    public static void main(String[] args) {
        Runnable tarea = new MyRunnable(100293933);

        Thread thread = new Thread(tarea);
        thread.start();

        System.out.println("Demo de threads");

    }
}
