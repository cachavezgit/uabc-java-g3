package mx.uabc.cursojava.concurrency.sincronizado;

public class CounterThread extends Thread {
    protected Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter=counter;
    }

    public void run() {
        for(int i=0;i<10;i++) {
            counter.add(i);
            try {
                Thread.sleep(3000);
            }
            catch(InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }
}
