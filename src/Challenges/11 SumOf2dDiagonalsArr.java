package Challenges;

class SumOf2dDaigonalsArr {
    public static void main(String[] args) {
        System.out.println("welcome to the diagonal Sum");
        System.out.println("Only for the Rows == columns");
        int[][] myArr = ArrayUtility.intput2DArray();
        long sum = sumDiagonals(myArr);
        System.out.println("your Diagonals Sum is = " +sum);

    }
    public static long sumDiagonals(int[][] myArr){
        long leftSum = sumLeftDiagonals(myArr);
        long rightSum = sumRightDiagonals(myArr);
        long sum = leftSum + rightSum;
        if (myArr.length % 2 != 0){ //Remove center element if matrix size is odd
            int ind = myArr.length / 2;
            sum -=myArr[ind][ind];
        }
        return sum;
    }
    public static long sumLeftDiagonals(int[][] myArr){
        int sum = 0;
        int i = 0;
        while(i < myArr.length){
            sum +=myArr[i][i]; //logic tells the adds the main elements
            i++;
        }
        return sum;
    }
    public static long sumRightDiagonals(int[][] myArr){
        int sum = 0;
        int i = 0;
        while (i < myArr.length){
            int col = myArr.length - 1 - i; //Reverse column index
            sum += myArr[i][col];
            i++;
        }
        return sum;
    }

}
