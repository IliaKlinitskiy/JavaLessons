package lessonCollection;

public class Test {
    public static void main(String[] args) {
        MyArrayTest gpa = new MyArrayTest();
        gpa.add("Роман");
        gpa.add("Сергей");
        gpa.add("Марк");
        gpa.add("Тимоха");
        gpa.add("Илья");
        gpa.remove("Тимоха");
        for (int i = 0; i < gpa.getSize(); i++) {
            System.out.println(gpa.get(i));
        }
    }
}
