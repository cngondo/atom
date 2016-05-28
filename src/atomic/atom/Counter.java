package atomic.atom;

/**
 * Created by ngondo on 5/25/16.
 */
public class Counter {
    private int c = 0;

    public void increment(){
        c++;
    }
    public void decrement(){
        c--;
    }
    public int value(){
        return c;
    }
}
