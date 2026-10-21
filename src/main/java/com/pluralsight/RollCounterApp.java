package com.pluralsight;

public class RollCounterApp {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int sum;
        int counter2 = 0;
        int counter4 = 0;
        int counter6 = 0;
        int counter7 = 0;

        // Roll dice 100 times, if sum meets conditions then add 1 to counter
        for (int i = 1; i < 101; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.printf("Roll %d:  %d - %d  Sum: %d\n", i, roll1, roll2, sum);
            if (sum == 2) {
                counter2++;
            } else if (sum == 4) {
                counter4++;
            } else if (sum == 6) {
                counter6++;
            } else if (sum == 7) {
                counter7++;
            }

        }
        // Print results
        System.out.println();
        System.out.println("===RESULTS===");
        System.out.printf("""
                Counter 2: %d
                Counter 4: %d
                Counter 6: %d
                Counter 7: %d""", counter2, counter4, counter6, counter7);

    }
}
