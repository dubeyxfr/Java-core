package in.kgcoding.Lambda;

public class TestingLambda {
    public static void main(String[] args) {
    TestingLambda  test = new TestingLambda();
    int sum = test.sum(2,4);
    }
    public void  printString(String toPrint){
        System.out.println(toPrint);
    }
    public int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
