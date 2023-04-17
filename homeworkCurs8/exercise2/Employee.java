package homeworkCurs8.exercise2;

import java.util.Date;

public class Employee implements Person{

    private Date dateOfEmployment;
    private String position;

    private String firstName, lastName, address;

    public Employee(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public Date getBirthday() {
        return null;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
