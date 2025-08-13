package Challenges;

public class ch_8MergeToSortedArr {
    public static void main(String[] args) {
        System.out.println("welcome to the Merge to sorted Array");
        int [] arr1 = ArrayUtility.intputArray();//input first Arr
        int [] arr2 = ArrayUtility.intputArray();//input second Arr
        int [] mergeArr = Merge(arr1, arr2);
        System.out.println("your merge Array is: ");
        ArrayUtility.displayarr(mergeArr);


    }
    public static int [] Merge(int[] arr1, int [] arr2){
        int newSize = arr1.length + arr2.length;//add the size of two Arr
        int[] newArr = new int [newSize]; // make the new Arr values by the Copy from new size Arr
        int i = 0 , j = 0, k = 0; //insilazations of the 3 arr
        while (i< arr1.length || j < arr2.length){ //if arr length small from i or j means his own insalizations start the loop
            if (j == arr2.length || i < arr1.length && arr1[i] < arr2[j]){ //copy conditions
                newArr[k] = arr1[i]; //copy arr values
                i++; //increment
                k++; //increment
            }else{
                newArr[k] = arr2[j];
                j++; //increment
                k++; //increment
            }
        }


    return newArr;
    }
}
