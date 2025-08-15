package Challenges;

public class Sumof2Darr {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum of the 2D array");
        int[][] numArr = ArrayUtility.intput2DArray();
        long Sum = sum(numArr);
        double Avg = avg(numArr);
        System.out.println("Average of the your 2D Array = " +Avg);
        System.out.println("Sum of the your 2D Array = " +Sum);
    }
    public static double avg(int[][] numArr){
        if (numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int colms = numArr[0].length;
        double size = rows * colms;//multiplications of the rows and columns
        return sum(numArr) / size;//avg logic of the 2D array
    }
    public static long sum(int[][] numArr){
        int sum = 0;
        int i = 0;
        while ( i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                sum += numArr[i][j]; //logic of the adding arrays values

                j++;
            }
            i++;
        }
        return sum;
    }
}
