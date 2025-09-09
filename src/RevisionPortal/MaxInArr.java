package RevisionPortal;

public class MaxInArr {
    public static void main(String[] args) {
        int[] myArr = {2,3,4,5};
        int max = myArr[0];
        for (int i = 1;i < myArr.length;i++){
            if (myArr[i] > max){
                max = myArr[i];
            }

        }
        System.out.println("maximum = " +max);
    }
}
