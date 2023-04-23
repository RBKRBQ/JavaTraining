package homeworkcurs8.exercise2;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getAddress() {
        return "db admin" + (super.getAddress());
    }
}
