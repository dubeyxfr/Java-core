package Challenges;

public class ch7_CheckingPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome check");
        int [] numArr = ArrayUtility.intputArray();
        boolean ispali = isPalindrome(numArr);
        if(ispali){
            System.out.println("Your num is Palindrome");
        }else{
            System.out.println("Your NUmber is Not Palindrome");
        }



    }
    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while (i < numArr.length / 2 ){ //run the loop half of the array
            if (numArr[i] != numArr[numArr.length - 1 - i]){ //checking the last number is equal to the first num or not
                return false;
            }
            i++; //increment
        }

    return true;
    }
}
