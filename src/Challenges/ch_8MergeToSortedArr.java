package Challenges;

public class ch_8MergeToSortedArr {
    public static void main(String[] args) {
        System.out.println("welcome to the Merge to sorted Array");
        int [] arr1 = ArrayUtility.intputArray();
        int [] arr2 = ArrayUtility.intputArray();
        int [] mergeArr = Merge(arr1, arr2);
        System.out.println("your merge Array is: ");
        ArrayUtility.displayarr(mergeArr);


    }
    public static int [] Merge(int[] arr1, int [] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int [newSize];
        int i = 0 , j = 0, k = 0;
        while (i< arr1.length || j < arr2.length){
            if (j == arr2.length || i < arr1.length && arr1[i] < arr2[j]){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }


    return newArr;
    }
}
