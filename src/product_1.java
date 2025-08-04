public class product_1 {
    public static int product_1(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int prod= product_1(a,b);
        System.out.println("the product of a and b is : " +prod);
    }
}
