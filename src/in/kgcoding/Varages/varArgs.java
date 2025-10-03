package in.kgcoding.Varages;

public class varArgs {
    public static void main(String[] args) {
        System.out.println(sum(1,3,4,5));
    }
    public static int sum(int...a){ //it's used for take the Multiple input  from the user.
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
