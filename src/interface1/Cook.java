package interface1;

public class Cook extends Worker implements AbleToCook{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName());
    }

    @Override
    public void prepare() {
        System.out.println("Готовлю еду");

    }
}
