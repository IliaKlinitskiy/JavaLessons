package mathRandom;

public class Test {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("��������� ����� %s. ���������� ��� ���...", random);
        System.out.println(result);
    }
}
