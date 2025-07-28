package Function;

public class whilefunction {
    public static void main(String[] args) {
        System.out.println("Pattern class");
    Whilepatter();
    }
    public static void Whilepatter(){
        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int i = 0;
            while (i<rows){
                System.out.print(" *");
                i++;
            }

            System.out.println();
            rows++;
        }
    }
}
