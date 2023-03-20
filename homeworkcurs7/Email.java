package homeworkcurs7;

public class Email implements AdProvider{
    @Override
    public void advertise(String text) {
        System.out.println("Spam email: " + text);
    }
}
