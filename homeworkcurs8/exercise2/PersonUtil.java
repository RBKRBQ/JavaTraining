package homeworkcurs8.exercise2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonUtil {
    private Person person;

    public PersonUtil(Person person) {
        this.person = person;
    }

    public String getFullName(){
        return String.format("%s %s", person.getFirstName(), person.getLastName());
    }

    //how to get the age based on the date of birth
    public int getAge(){
        LocalDate birthDate = person.getBirthdate();
        LocalDate now = LocalDate.now();
        //boolean hasPassed = now.getMonthValue()>birthDate.getMonthValue() || now.getMonthValue() == birthDate.getMonthValue() && now.getDayOfMonth() > birthDate.getDayOfMonth();
        boolean hasPassed2 = now.getDayOfYear() > birthDate.getDayOfYear();
        return now.getYear() - birthDate.getYear() - (hasPassed2 ? 0 : 1);
    }

    public int getAge2(){
        return (int)ChronoUnit.YEARS.between(person.getBirthdate(), LocalDate.now());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Mike", "Liam");
        employee.setBirthDate(LocalDate.of(2003,1,10));

        PersonUtil personUtil = new PersonUtil(employee);

        System.out.println(personUtil.getAge());
        System.out.println(personUtil.getAge2());



    }
}
