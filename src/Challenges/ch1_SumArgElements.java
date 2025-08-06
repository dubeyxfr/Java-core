package Challenges;

public class ch1_SumArgElements {
    public static void main(String[] args) {
        System.out.println("Welcome to the SumArgElemets");
        int[] numArray = ArrayUtility.intputArray();
        long Sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("sum of the Array: " +Sum);
        System.out.println("Average of the Array: " +avg);





    }
    public static long sum(int[] numArray){
        int sum = 0;
        int i = 0;
        while ( i < numArray.length){
            sum += numArray[i];
            i++;
        }

        return sum;
    }
    public static int average(int[] numArray){
      long sum = sum(numArray);
      return (int) (sum/numArray.length);
    }
}
