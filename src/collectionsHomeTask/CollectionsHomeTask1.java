package collectionsHomeTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsHomeTask1 {
    public static void main(String[] args) {
        Map<Product, List> groceryList = new HashMap();

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("������");
        vegetables.add("������");
        vegetables.add("�����");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("�����");
        fruit.add("�������");
        fruit.add("����");

        ArrayList<String> berries = new ArrayList<>();
        berries.add("�������");
        berries.add("������");
        berries.add("���������");

        Product product1 = new Product("�����");
        Product product2 = new Product("������");
        Product product3 = new Product("�����");

        groceryList.put(product1, vegetables);
        groceryList.put(product2, fruit);
        groceryList.put(product3, berries);

        System.out.println("������ " + "- " + groceryList.get(product2));
        System.out.println("����� " + "- " + groceryList.get(product1));
        System.out.println("����� " + "- " +groceryList.get(product3));

    }
}
