package homeworkcurs7.exercise4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John",10);
        Student student2 = new Student("Mike",7);
        Student student3 = new Student("Ellen",8);

        System.out.println(Student.averageGrade());
    }
}
