package com.pluralsight;

public class RollCounterApp {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int sum;
        int counter2;
        int counter4;
        int counter6;
        int counter7;

        for (int i = 1; i < 101; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.printf("Roll %d:  %d - %d  Sum: %d\n", i, roll1, roll2, sum);

        }

    }
}
