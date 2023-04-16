package interfaces2;

public class Romanian implements Citizen {

    private int age;
    private String name;
    private long identifier;


    @Override
    public String getHomeCountry() {
        return "Romania";
    }

    @Override
    public long getIdentifier() {
        return identifier;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
