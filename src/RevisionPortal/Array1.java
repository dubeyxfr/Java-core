package RevisionPortal;

public class Array1 {
    public static void main(String[] args) {
        int[] myArr = {1,3,4,5};
        int sum = 0;
        for (int i = 0;i < myArr.length; i++){
            sum += myArr[i];
        }
        System.out.println("Sum =" +sum);

    }
}
