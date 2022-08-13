package anonymousClasses;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "Îעקוע חא " + countOfMonths + " לוסÿצוג";
            }
        }, 10);
    }
}
