package homeWorkConstructor;

public class Worker {
    String name;
    String post;
    int salary;
     String test() {
         return "git in UI";
     }

    public Worker(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    String getInfo (int month) {
        return "��� - " + name + ". ��������� - " + post + ". �� �������� " + month + " ������� ��������� " + salary * month + " ������.";
    }
}