package Control_Statments;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("\nBefore loop");
        for (int i = 0;  i <=100 ; i++){
            if( i == 101)
                break;
            System.out.print(i + " ");
        }
        System.out.println("\nOut of loop");
    }
}
