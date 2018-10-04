public class Main {
    public static void main(String[] args) {
        int[] alpha = new int[15]; //a
        System.out.println(alpha[9]); //b
        alpha[4] = 35; //c
        alpha[8] = alpha[5] + alpha[12]; //d
        alpha[3] = (3 * alpha[7]) - 57; //e

        //f
        int counter = 1;
        for (int value : alpha) {
            System.out.printf("%4d ",value);
            if (counter%5 == 0)
                System.out.println();
            counter++;
        }
    }

}