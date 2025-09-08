package Challenges;

public class DiceRoll {
    int roll() {
        double random = Math.random() * 6;
        int currentRandom = (int) Math.round(random);
        return currentRandom;
    }


    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println("Roll " + i + "=>"+
                    dice.roll());
        }



    }
}
