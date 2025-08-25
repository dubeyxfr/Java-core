public class R4_Array {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4};
        int sum = 0;
        int i = 0;
        while (i < myArr.length){
            sum+=myArr[i];
            i++;
        }
        System.out.println(sum);
    }
}
