package BasicsCode;

public class R5_Array {
    public static void main(String[] args) {
        int[] myArr = {1, 3, 4, 6, 7, 8};
      int max = myArr[0];
      int i = 1;
      while (i < myArr.length){
          if(myArr[i]>max){
              max = myArr[i];
          }
          i++;
      }
        System.out.println("your Maximum num in Array is " +max);




    }

}

