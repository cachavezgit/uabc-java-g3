package mx.uabc.cursojava.concurrency.sincronizado;

public class Counter {
    long count = 0;

    public synchronized void add(long value){
        this.count+=value;
        System.out.println(count);
    }
}
