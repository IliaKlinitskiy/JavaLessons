package collectionsHomeTask;

import java.util.Scanner;

public class CollectionHomeTask2 extends Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����");
        if (scanner.hasNextInt()) {
            int number = getFactorial(scanner.nextInt());
            System.out.println("��������� ���������� ���� ����� =" + number);
        } else {
            System.out.println("��������, �� �� ����� �� �����. ������������� ��������� � ���������� �����!");
        }
        scanner.close();
    }
}
