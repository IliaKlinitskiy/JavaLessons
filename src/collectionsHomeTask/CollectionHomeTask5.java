package collectionsHomeTask;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionHomeTask5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int random = (int) (Math.random() * 100);
            arrayList.add(random);
            System.out.println(random);
        }
        System.out.println("Максимальное значение: " + Collections.max(arrayList));
    }
}

