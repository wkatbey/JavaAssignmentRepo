import java.security.SecureRandom;
public class Q11 {
    public static void main(String[] args) {
        int[] possibleSumTally = new int[37];
        double[] sumTallyPercentages = new double[13];
        double totalTallySum = 0;
        int sum = 0;
        int diceOneRoll = 0;
        int diceTwoRoll = 0;
        SecureRandom randomRoll = new SecureRandom();
        for (int i = 0; i < 3600000; i++) {
            diceOneRoll = 1 + randomRoll.nextInt(6); //Random integer from 1 to 6
            diceTwoRoll = 1 + randomRoll.nextInt(6);
            //System.out.printf("%s: %d%n", "Dice 1 Roll", diceOneRoll);
            //System.out.printf("%s: %d%n", "Dice 2 Roll", diceTwoRoll);
            sum = diceOneRoll + diceTwoRoll;
            possibleSumTally[sum]++; 
        }


        System.out.printf("%-3s %12s %15s%n", "Sum", "Frequency", "Percentage");

        for (int i = 2; i < 13; i++) {
            totalTallySum += possibleSumTally[i];
        }

        for (int i = 2; i < 13; i++) {
            double tempSumTally = possibleSumTally[i];
            sumTallyPercentages[i] = (possibleSumTally[i]/totalTallySum) * 100;
        }

        for (int i = 2; i < 37; i++) {
            if (possibleSumTally[i] != 0) {
                 System.out.printf("%-3d %12d %15f%n", i, possibleSumTally[i], sumTallyPercentages[i]);
            }
           
        }

    }
}