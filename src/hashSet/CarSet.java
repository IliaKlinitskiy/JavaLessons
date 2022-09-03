package hashSet;

import collectionLvl2.Car;

public interface CarSet {
    boolean add(Car car);
    boolean remove(Car car);
    int size();
    void clear();
}
