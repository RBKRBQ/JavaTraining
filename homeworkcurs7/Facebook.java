package homeworkcurs7;

import java.sql.SQLOutput;

public class Facebook implements AdProvider{
    @Override
    public void advertise(String text) {
        System.out.println("Posting " + text + " on facebook");

    }
}
