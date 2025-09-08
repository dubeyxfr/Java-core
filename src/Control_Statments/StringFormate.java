package Control_Statments;

public class StringFormate {
    public static void main(String[] args) {
        String name = "sandeep";
        int marks = 45654;

        // printf method
        System.out.printf("Hello %s, got the %,5d marks in the maths subject%n", name, marks);

        // OR format method
        System.out.format("Hello %10s, got the %d marks in the maths subject%n", name, marks);
    }
}
