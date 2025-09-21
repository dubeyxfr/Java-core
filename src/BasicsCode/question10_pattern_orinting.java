package BasicsCode;

public class question10_pattern_orinting {
    public static void question10_pattern_orinting(int n) {

        //outer
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        question10_pattern_orinting(4);
    }


}







