package homeworkcurs8.exercise2;

public class Programmer extends Employee{

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "Programmer";
    }
}
