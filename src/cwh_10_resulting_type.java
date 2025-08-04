public class cwh_10_resulting_type {

    public static void main(String[] args) {
        int a, b, c;
        a = 12;
        b = 20;
        c = 13;


        if (a > b) {
            if (a > c) {
                System.out.println("Maximum num is " + a);
            } else {
                System.out.println("Maximum num is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Maximum num is " + b);
            } else {
                System.out.println("Maximum num is " + c);
            }
        }


    }
}


