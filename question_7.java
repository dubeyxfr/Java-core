import java.util.Scanner;
public class question_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the num : ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println("your num is : " +n);


        }while(true);
    }
}
