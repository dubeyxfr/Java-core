package in.kgcoding.PassBy;

public class passByvalue {
    public static void main(String[] args) {
    int x = 4;
    int y = 6;
    int sum = add(x,y);
        System.out.printf("x = %d, y = %d, sum = %d",x,y,sum);
    }
    public static int add (int a ,int b){
       a+=b;
       return a;
    }
}
