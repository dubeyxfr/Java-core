package Control_Statments;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] arr = {"Ram", "Shyam", "Rita", "Sita"};

        // Call the method to print array
        //printArray(arr);
        printArrByFor(arr);
    }

    // Method to print array elements
//    public static void printArray(String[] arr) {
//        for (String name : arr) {
//            System.out.println(name);
//        }
//    }
    public static void printArrByFor(String[] arr){
        for (int i = 0 ; i < arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}

