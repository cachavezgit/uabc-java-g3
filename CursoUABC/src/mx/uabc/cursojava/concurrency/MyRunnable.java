package mx.uabc.cursojava.concurrency;

public class MyRunnable implements Runnable{
    private final long countUntil;

    public MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i=0;i<countUntil;i++) {
            sum+=1;
            System.out.println(sum);
        }

    }
}
