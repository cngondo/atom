package atomic.atom;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ngondo on 5/25/16.
 */
public class AtomicCounter {
    private AtomicInteger c = new AtomicInteger(0);

    public void increment(){
        c.incrementAndGet();
    }
    public void decrement(){
        c.decrementAndGet();
    }
    public int value(){
        return c.get();
    }
}
