package ObjectJava;

class CourseClass {
    static int maxCapacity = 100; // Maximum students allowed in any course

    String courseName;
    int enrollments;
    String[] students;

    // Constructor
    CourseClass(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.students = new String[maxCapacity];
    }

    // Add a student
    void enrollStudent(String studentName) {
        if (enrollments >= maxCapacity) {
            System.out.println("Course is full!");
            return;
        }
        students[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " enrolled successfully.");
    }

    // Remove a student (just by reducing count, simple version)
    void unEnrollStudent() {
        if (enrollments > 0) {
            System.out.println(students[enrollments - 1] + " removed from the course.");
            enrollments--;
        } else {
            System.out.println("No students to remove.");
        }
    }

    // Show all students
    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (int i = 0; i < enrollments; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public static void main(String[] args) {
        CourseClass javaCourse = new CourseClass("Java Programming");

        javaCourse.enrollStudent("Alice");
        javaCourse.enrollStudent("Bob");
        javaCourse.showStudents();

        javaCourse.unEnrollStudent();
        javaCourse.showStudents();
    }
}
