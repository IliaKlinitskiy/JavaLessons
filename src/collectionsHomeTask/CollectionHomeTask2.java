package collectionsHomeTask;

import java.util.Scanner;

public class CollectionHomeTask2 extends Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        if (scanner.hasNextInt()) {
            int number = getFactorial(scanner.nextInt());
            System.out.println("Факториал введенного Вами числа =" + number);
        } else {
            System.out.println("Извините, но Вы ввели не число. Перезапустите программу и попробуйте снова!");
        }
        scanner.close();
    }
}
