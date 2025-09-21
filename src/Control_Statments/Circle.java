package Control_Statments;

import java.util.Scanner;

class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Circumference of Circle
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Area of Circle
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // toString override


    @Override
    public String toString() {
        return "Circle " +"Radius = " + radius +"\ngetCircumference = " + getCircumference() + "\nfgetArea = " +getArea();
    }

    // BasicsCode.Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Circle Program\n");
        System.out.print("Please Enter the Radius of the Circle: ");
        double radius = input.nextDouble(); // double use kar better accuracy ke liye

        Circle circle = new Circle(radius);

        // Print circle details
        System.out.println(circle.toString());
    }
}

