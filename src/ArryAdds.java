import java.util.Arrays;

public class ArryAdds {
    public static void main(String[] args) {
        int[] arr1 = {12,12};
        int[] arr2 = {12,12};
        int [] adds = new int [arr1.length];
        for (int i = 0;i< arr1.length;i++){
            adds[i] = arr1[i] + arr2[i];

        }
        System.out.println(Arrays.toString(adds));


    }
}
