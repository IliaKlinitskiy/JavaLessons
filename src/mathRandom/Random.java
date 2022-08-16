package mathRandom;

public class Random {
    int random = (int) (Math.random() * 90 + 10);
    @Override
    public String toString() {
        String result = String.format("Случаное число %s. \nПопробуйте еще раз.", random);
                return result;
    }
}
