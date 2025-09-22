package in.kgcoding.Polymorphis;

public class overloding {
   public static int add(int a, int b){
       return a + b;
   }
   public static int add(int a,int b,int c,int d){
       return a + b+ c+ d;
   }
   public static String add (String a , String b){
       return a + b;
   }

    public static void main(String[] args) {
        overloding overload = new overloding();
        int sum = overloding.add(4,5);
        System.out.println(overloding.add(7,sum));
        System.out.println(overloding.add(8,2));
        System.out.println(overloding.add("12","dd"));
    }
}
