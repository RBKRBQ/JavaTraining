package abstractClass;

public class Dog extends Animal{
    private int weight;
    private int numberOfLegs;
    @Override
    public String talk() {
        return "ham-ham";
    }

    @Override
    public String walk() {
        return "dog walking";
    }
}
