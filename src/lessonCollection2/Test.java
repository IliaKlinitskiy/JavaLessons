package lessonCollection2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesAndNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        names.add("������");
        names.add("����");
        names.add("�����");
        names.add("�����");
        names.add("����");
        names.add("����");
        names.add("����");
        names.add("�����");
        names.add("�����");
        names.add("�����");
        for (int i = 0; i < numbers.size(); i++) {
            String s = numbers.get(i) + " - " + names.get(i);
            namesAndNumbers.add(s);
        }
        for (String s : namesAndNumbers) {
            System.out.println(s);
        }
    }
}
