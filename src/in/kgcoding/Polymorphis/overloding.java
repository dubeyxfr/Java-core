package in.kgcoding.Polymorphis;

public class overloding {
   public static int sum(int a, int b){
       return a + b;
   }
   public static int sum(int a,int b,int c,int d){
       return a + b+ c+ d;
   }

    public static void main(String[] args) {
        overloding overload = new overloding();
        int sum = overloding.sum(4,5);
        System.out.println(overloding.sum(7,sum));
        System.out.println(overloding.sum(8,2));
    }
}
