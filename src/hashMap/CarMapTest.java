package hashMap;

import collectionLvl2.CarLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarMapTest {
    private CarMap map;

    @Before
    public void setUp() throws Exception {
        map = new CarHashMap();
    }

    @Test
    public void whenPut100ElementsThenSizeBecon100() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }
        assertEquals(100, map.size());
    }

    @Test
    public void removeReturnTrueOnlyOnce() {
        for (int i = 0; i < 10; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }
        assertEquals(10, map.size());
        CarOwner owner = new CarOwner(5, "����", "������");
        assertTrue(map.remove(owner));
        assertEquals(9, map.size());
        assertFalse(map.remove(owner));
    }

    @Test
    public void whenPut100ElementsWith10DifferentKeysThenSize10() {
        for (int i = 0; i < 100; i++) {
            int index = i % 10;
            CarOwner carOwner = new CarOwner(index, "Name" + index, "LastName" + index);
            Car car = new Car("Brand" + index, index);
            map.put(carOwner, car);
        }
        assertEquals(100, map.size());
    }

    @Test
    public void countOfKeysMustBeEqualsToCountValues() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }
        assertEquals(100, map.size());
        assertEquals(100, map.keySet().size());
        assertEquals(100, map.values().size());
    }

}