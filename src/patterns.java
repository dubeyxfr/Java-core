public class patterns {
    public static void hollow_rectangle(int totrows, int totcols) {
        //outer loops
        for (int i=1;i<=totrows;i++){
            //inner colums
            for (int j=1;j<=totcols;j++){
                // cell-(ij)
                if(i==1 || i == totrows || j ==1 || j == totcols) {
                    //boundery
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args){
    hollow_rectangle(4, 5);
    }
}
