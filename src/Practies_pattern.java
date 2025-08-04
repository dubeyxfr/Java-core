public class Practies_pattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++) {
            int j;
            for (j = 1; j <= n - i; j++) ;
            System.out.print(j + "*");

        }
        System.out.println();


    }
}
