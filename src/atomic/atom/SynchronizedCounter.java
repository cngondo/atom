package atomic.atom;

/**
 * Created by ngondo on 5/25/16.
 */
public class SynchronizedCounter {
    private int c = 0;
    public synchronized void increment(){
        c++;
    }
    public synchronized void decrement(){
        c--;
    }
    public synchronized int value(){
        return c;
    }
}
