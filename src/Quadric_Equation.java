import java.util.Scanner;
public class Quadric_Equation {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Find the roots of a Quadratic Equation (ax^2 + bx + c = 0)");

            System.out.print("Enter the value of a: ");
            double a = input.nextDouble();

            System.out.print("Enter the value of b: ");
            double b = input.nextDouble();

            System.out.print("Enter the value of c: ");
            double c = input.nextDouble();

            double discriminant = b * b - 4 * a * c;

            System.out.println("\nDiscriminant (D) = " + discriminant);

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots are real and different.");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The roots are real and equal.");
                System.out.println("Root = " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The roots are complex and imaginary...");
                System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }


