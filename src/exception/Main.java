package exception;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            System.out.println(array[12]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("����� �� ������� �������");
        }
    }
}
