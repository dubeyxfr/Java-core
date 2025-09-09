package RevisionPortal;

public class miniNum {
    public static void main(String[] args) {
        int[] myArr = {1,4,5,6,7};
        int min = myArr[0];
        for (int i = 1; i < myArr.length; i++){
            if (myArr[i]< min){
                min = myArr[i];

            }
        }
        System.out.println(min);
    }
}
