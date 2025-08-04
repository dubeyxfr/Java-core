public class pattern_printed_inverted {
    public static void pattern_printed_inverted(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            //coloum
            for (int j = 1;j<=totcols;j++){
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*")
                    ;
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern_printed_inverted(4,4);
    }
}
