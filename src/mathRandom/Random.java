package mathRandom;

public class Random {
    int random = (int) (Math.random() * 90 + 10);
    @Override
    public String toString() {
        String result = String.format("�������� ����� %s. \n���������� ��� ���.", random);
                return result;
    }
}
