package in.kgcoding.Challenge82;

public class ArrayOperation {
    private int [] numbers;

    public ArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    public class statistics {
        double mean(){
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }
        double median() {
            return 0;
        }
    }

    public class Statistics {
        
    }
}
