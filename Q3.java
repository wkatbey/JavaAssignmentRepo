import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Correcting array initialization issue
        int[] myList = new int[10];

        //Correcting ArrayIndexOutOfBoundsException
        for (int i = 0; i < 10; i++)
            myList[i] = console.nextInt();

        for (int i = 0; i < 10; i++) 
            System.out.print(myList[i] + " ");
        System.out.println();
    }
}