import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sumOfVotes = 0;
        String[] candidateLastName = new String[5];
        double[] candidateVotes = new double[5];
        double[] candidatePercentages = new double[5];


        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %s","Enter Candidate", (i+1), "'s Last Name: ");
            candidateLastName[i] = input.next();
            System.out.printf("%s %d %s", "Enter Candidate", (i+1), "'s Votes: ");
            candidateVotes[i] = input.nextInt();
            sumOfVotes += candidateVotes[i]; //Totals all votes, to be used in next loop
        }

        for (int i = 0; i < 5; i++) {
            candidatePercentages[i] = (candidateVotes[i]/sumOfVotes) * 100;
        }

        System.out.printf("%-15s%14s%18s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s%14.0f%18.2f%n", candidateLastName[i], candidateVotes[i], candidatePercentages[i]);
        }
        System.out.printf("%-15s%14.0f%n", "Total", sumOfVotes);
        
    }
}