package lessonCollection;

public class Test {
    public static void main(String[] args) {
        MyArrayTest gpa = new MyArrayTest();
        gpa.add("�����");
        gpa.add("������");
        gpa.add("����");
        gpa.add("������");
        gpa.add("����");
        gpa.remove("������");
        for (int i = 0; i < gpa.getSize(); i++) {
            System.out.println(gpa.get(i));
        }
    }
}
