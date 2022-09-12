package collectionLvl2;

import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.*;

public class CarQueueTest {
    private Queue  queue;


    @Before
    public void setUp() throws Exception {
        //init
        for (int i = 0; i < 10; i++) {
      queue.add(new Car("Brand" + i, i));
       }
    }

    @Test
    public void add() {
        assertEquals(10, queue.size());
    }

    @Test
    public void peek() {
        Car car = (Car) queue.peek();
        assertEquals("Brand0", car.getBrand());
        assertEquals(10, queue.size());
    }

    @Test
    public void poll() {
        Car car = (Car) queue.poll();
        assertEquals("Brand0", car.getBrand());
        assertEquals(9, queue.size());
    }
}