package Control_Statments;

import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Score\n");
        System.out.print("Enter The Student Marks : ");
        int marks = input.nextInt();
        String category = marks > 80 ? "high" : (marks > 50 ? "moderate" : "lower");
        System.out.println("Your Marks category is " +category);
    }
}
