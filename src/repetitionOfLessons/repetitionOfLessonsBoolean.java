package repetitionOfLessons;

public class repetitionOfLessonsBoolean {
    public static void main(String[] args) {
        int time = 20;
        boolean goodWeather = true;
        boolean late = time >= 22 || time <= 8;
        if (late) {
            System.out.println("�����");
        } if (!late && goodWeather) {
            System.out.println("��� ������");
        } if (!late && !goodWeather) {
            System.out.println("����� ������");
        } if (late && goodWeather) {
            System.out.println("������ ��������");
        }
    }
}
