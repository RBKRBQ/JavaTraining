package homeworkCurs8.exercise2;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
    }

    @Override
    public String getAddress() {
        return "db admin" + (super.getAddress());
    }
}
