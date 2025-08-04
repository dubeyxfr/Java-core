
public class last_digit_printing {
    public static void main(String[] args){
        int n = 108999;
        while( n > 0){
            int lastdigit = n%10;
            System.out.println(lastdigit);
            n = n / 10;

        }
        System.out.println("");
    }

}
