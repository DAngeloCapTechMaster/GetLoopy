import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        int rollCount = 0;
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");

        while (true) {
            rollCount++;
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int die3 = random.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);

            // Check if all dice are the same (a triple)
            if (die1 == die2 && die2 == die3) {
                System.out.println("Triple found! Ending rolls.");
                break;
            }
        }
    }
}
