package collections.lists;

import homeworkcurs8.exercise2.Employee;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Employee> prioQ = new PriorityQueue<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getPriority(), o2.getPriority());
            }
        });

        prioQ.add(new Employee("A", "B", 1));
        prioQ.add(new Employee("C", "D", 1));
        prioQ.add(new Employee("E", "F", 0));

        Employee employee = prioQ.poll();
        System.out.println(employee);
    }
}
