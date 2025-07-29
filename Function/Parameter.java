package Function;

public class Parameter {
    public static void main(String[] args) {
        int num = SumTwoNum(8,9);
                            //Arguments
        System.out.println("the Addition of Arguments: " +num);
        //short form for reduces the length of the code we can use it
        //System.out.println(SumTwoNum(8,9));

    }
    public static int SumTwoNum(int num1, int num2){
                                //Parameters
        System.out.println("first num is recevied: " + num1);
        System.out.println("Second num is recevied: " + num2);

        int Sum = num1 + num2;
        return Sum;

    }
}
