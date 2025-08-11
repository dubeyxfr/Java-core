package Challenges;

public class reverseArr {
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse the Array");
        int[] numarr = ArrayUtility.intputArray();
        reverse(numarr);
        System.out.println("Your new array are...");
        ArrayUtility.displayarr(numarr);


    }
    public static void reverse (int[] arr){
        int i = 0;// insilisation of loop
        while (i < arr.length /2){ //its use for start the loop for only for the half of the Swap the num
            int swap = arr[i];//swaping the number
            arr [i] = arr[(arr.length - 1) -i]; // between part of the swaping
            arr[(arr.length - 1) -i] = swap; // last valuee swap to first position
            i++;
        }

    }
}
