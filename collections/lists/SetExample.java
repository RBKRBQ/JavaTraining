package collections.lists;

import homeworkcurs8.exercise2.Employee;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        Set<Employee> employees1 = new TreeSet<>();
        //setMethods(employees);
        setMethods(employees1);

    }

    private static void setMethods(Set<Employee> employees) {
        Employee e1 = new Employee("A","B");
        e1.setBirthDate(LocalDate.ofYearDay(2000,15));
        Employee e2 = new Employee("B","C");
        e2.setBirthDate(LocalDate.ofYearDay(2001,15));
        employees.add(e1);
        employees.add(e2);
        employees.add(e2); //will not be added because it is identical
        Employee e3 = new Employee("A","B");
        e3.setBirthDate(LocalDate.ofYearDay(1999,15));
        employees.add(e3);


        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            System.out.println(e.getBirthdate());
            System.out.println(e);
        }
    }
}
