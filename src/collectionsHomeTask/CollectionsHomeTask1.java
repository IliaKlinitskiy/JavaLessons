package collectionsHomeTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsHomeTask1 {
    public static void main(String[] args) {
        Map<Product, List> groceryList = new HashMap();

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Томаты");
        vegetables.add("Огурцы");
        vegetables.add("Перцы");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Грушы");
        fruit.add("Персики");
        fruit.add("Дыни");

        ArrayList<String> berries = new ArrayList<>();
        berries.add("Ежевика");
        berries.add("Малина");
        berries.add("Смородина");

        Product product1 = new Product("Овощи");
        Product product2 = new Product("Фрукты");
        Product product3 = new Product("Ягоды");

        groceryList.put(product1, vegetables);
        groceryList.put(product2, fruit);
        groceryList.put(product3, berries);

        System.out.println("Фрукты " + "- " + groceryList.get(product2));
        System.out.println("Овощи " + "- " + groceryList.get(product1));
        System.out.println("Ягоды " + "- " +groceryList.get(product3));

    }
}
