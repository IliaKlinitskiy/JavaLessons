package stringsAndSwitchCase;

public class Space {
    public static void main(String[] args) {
        String month = "����";

        switch (month) {
            case "�������":
            case "������":
            case "�������":
                System.out.println("����");
                break;
            case "����":
            case "������":
            case "���":
                System.out.println("�����");
                break;
            case "����":
            case "����":
            case "������":
                System.out.println("����");
                break;
            case "��������":
            case "�������":
            case "������":
                System.out.println("�����");
                break;
            default:
                System.out.println("�������������� ����� ����");
                break;
        }
    }
}
