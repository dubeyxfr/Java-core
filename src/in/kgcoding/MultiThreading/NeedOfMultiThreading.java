package in.kgcoding.MultiThreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        //First task.
        for (int i = 0; i < 1000 ; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n * task complete");
        //Second TAsk
        for (int i = 0; i < 1000 ; i++) {
            System.out.printf("%d& ", i);
        }
        System.out.printf("\n * task complete");
        //Third TAsk
        for (int i = 0; i < 1000 ; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n * task complete");
        //Fourth task
        for (int i = 0; i < 1000 ; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n * task complete");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d" , (endTime));
    }

}
