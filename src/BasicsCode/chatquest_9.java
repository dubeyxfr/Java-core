package BasicsCode;

public class chatquest_9 {
        public static void main(String[] args) {
            int n = 4;
            for (int line = 1; line <= n; line++) {
                for (int star = 1; star <= n - line + 1; star++) {
                    System.out.print("*"); // print * without newline
                }
                System.out.println(); // move to next line after inner loop
            }
        }
    }


