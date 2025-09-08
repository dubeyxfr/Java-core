package Control_Statments;

public class PMath {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-99));
//        System.out.println(Math.ceil(12.09));
//        System.out.println(Math.floor(12.07));
//        System.out.println(Math.round(12.04));
//        System.out.println(Math.random());
        for (int i = 1 ; i < 10; i++ ) {
            long random = Math.round(Math.random() * 100);
            System.out.println("your num is " + random);
        }

    }
}
