package interface1;

public class Programmer extends Worker implements CapableOfProgramming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName());
    }

    @Override
    public void writeCode() {
        System.out.println("ѕишу код");
    }
}
