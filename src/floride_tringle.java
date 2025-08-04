public class floride_tringle {
    public static void floride_tringle(int n){
        int counter = 1;
        //lines

        for (int i =1;i<=n;i++){
        for (int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();

            }

    }

    public static void main(String[] args) {
        floride_tringle(5);

    }
}
