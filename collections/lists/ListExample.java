package collections.lists;

import homeworkcurs8.exercise2.Employee;
import homeworkcurs8.exercise2.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        //The problem with extending an array
        Person[] people = {new Employee("Mike","Liam")};
        Person[] people1 = new Person[people.length + 1];
        for(int i=0;i<people.length; i++) {
            people1[i] = people[i];
        }
        people1[people1.length - 1] = new Employee("Mike2","Liam2");

        //ArrayLists increase size as needed, automatically. They have a grow() method in the implementation
        System.out.println("ArrayList");
        List<Person> people2 = new ArrayList<>();
        listMethods(people2);

        //LinkedList
        System.out.println("LinkedList");
        List<Person> linkedPeople = new LinkedList<>();
        listMethods(linkedPeople);
    }

    private static void listMethods(List<Person> people2) {
        people2.add(new Employee("Mike3","Liam3"));
        people2.add(new Employee("Mike4","Liam4"));
        System.out.println(people2.get(0));
        System.out.println(people2.get(1));

//the object located at index 1 is not overwritten, it is moved to index 2
        people2.add(1, new Employee("Bill", "Gates"));
        System.out.println(people2.get(1));
        System.out.println(people2.get(2));

        people2.remove(0);
        System.out.println(people2.get(0));
    }
}
