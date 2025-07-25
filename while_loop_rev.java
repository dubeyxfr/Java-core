public class while_loop_rev {
    public static void main(String[] args){
        int i = 0;
        while (i<=10){

                if ( i == 3)
                {
                    i++;
                    continue;
                }

            System.out.print(i + " ");

            i++;
        }
    }
}
