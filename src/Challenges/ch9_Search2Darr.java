package Challenges;

import java.util.Scanner;

class ch9_Search2Darr {
    public static void main(String[] args) {
        System.out.println("Welcome to the 2d Array Search ");
        Scanner input = new Scanner(System.in);
        int [][] newArr = ArrayUtility.intput2DArray();
        System.out.print("Enter the Num which you want to check: ");
        int num = input.nextInt();
        boolean isfound = search(newArr,num);
        if (isfound){
            System.out.println("your Num is Found in the array ");
        }else{
            System.out.println("your Num is Not Found in the array ");
        }


    }
    public static boolean search(int [][]newArr, int num){
        int i = 0;
        while(i < newArr.length){
            int j = 0;
            while (j < newArr[i].length){
                if (newArr[i][j] == num) return true;

            }
        }

        return false;

    }
}
