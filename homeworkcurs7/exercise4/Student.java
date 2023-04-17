package homeworkcurs7.exercise4;

public class Student {
    public static int numberOfStudents = 0;
    public static int sumOfGrades = 0;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        numberOfStudents++;
        sumOfGrades += grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static String averageGrade(){
        return  "The average Grade is " + sumOfGrades / numberOfStudents;
    }

}
