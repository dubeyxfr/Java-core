import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("calculator of CGPA\n");
        System.out.print("Enter first subject point: ");
        int num1 = scanner.nextInt();

        System.out.print("enter second subject point: ");
                int num2 = scanner.nextInt();
        System.out.print("Enter third subject point: ");
        int num3 = scanner.nextInt();
        System.out.print("enter fourth subject point: ");
        int num4 = scanner.nextInt();

        int sum = (num1 + num2+ num3 + num4)/4;
        System.out.println(": "+ sum);






    }
}