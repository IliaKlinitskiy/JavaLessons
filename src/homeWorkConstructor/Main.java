package homeWorkConstructor;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Вася", "Мэр", 120000);
        System.out.println(worker.getInfo(12));
    }

}
