package Control_Statments;

public class ch70_student {
    String StudentName;
    int Age;
    int Class;

    // Constructor
    public ch70_student(String studentName, int age, int aClass) {
        StudentName = studentName;
        Age = age;
        Class = aClass;
    }

    @Override
    public String toString() {
        return "ch70_student{" +
                "StudentName='" + StudentName + '\'' +
                ", Age=" + Age +
                ", Class=" + Class +
                '}';
    }

    public static void main(String[] args) {
        ch70_student StudentDetail = new ch70_student("Prashant", 19, 12);

        // Print object → toString() auto call hota hai;
        System.out.println(StudentDetail);
    }
}
