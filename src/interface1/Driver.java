package interface1;

public class Driver extends Worker implements AbleToDrive{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName());
    }

    @Override
    public void drive() {
        System.out.println("Вожу машину");

    }
}
