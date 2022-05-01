package repetitionOfLessons;

public class repetitionOfLessonsBoolean {
    public static void main(String[] args) {
        int time = 20;
        boolean goodWeather = true;
        boolean late = time >= 22 || time <= 8;
        if (late) {
            System.out.println("Спать");
        } if (!late && goodWeather) {
            System.out.println("Иду гулять");
        } if (!late && !goodWeather) {
            System.out.println("Читаю книжку");
        } if (late && goodWeather) {
            System.out.println("Ночная прогулка");
        }
    }
}
