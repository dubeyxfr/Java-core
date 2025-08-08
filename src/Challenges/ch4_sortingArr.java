

package Challenges;

public class ch4_sortingArr {
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.intputArray();
        System.out.println("Welcome to the Sorting Array\n");

        boolean inc = increase(myArr);
        boolean dec = decreasing(myArr);

        if (inc || dec) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean increase(int[] myArr) {
        int i = 1;
        while (i < myArr.length) {
            if (myArr[i] < myArr[i - 1]) {  // compare with previous element
                return false;
            }
            i++; // important to avoid infinite loop
        }
        return true;
    }

    public static boolean decreasing(int[] myArr) {
        int i = 1;
        while (i < myArr.length) {
            if (myArr[i] > myArr[i - 1]) { // compare with previous element
                return false;
            }
            i++; // avoid infinite loop
        }
        return true;
    }
}
