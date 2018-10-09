public class Q7 {
    public static void main(String[] args) {
        int[][] alpha = new int[10][20]; //a

        //b
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[i].length; j++) {
                alpha[i][j] = 5;
            }
        }

        //c
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[0].length; j++) {
                if (i == 0) //If we're in the first row
                    alpha[i][j] = 1;
                else
                    alpha[i][j] = 2;
            }
        }

        //d
         for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[0].length; j++) {
                if (j == 0) //If we're in the first coumn
                    alpha[i][j] = 5;
                else
                    alpha[i][j] = 2*alpha[i][j-1];
            }
        } 

        //e - Print array alpha one row per line
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[i].length; j++) {
                System.out.print(alpha[i][j] + " ");
            }
            System.out.println();
        }

        //f - Print array alpha one column per line
        int row = 0;
        int col = 0;
        while (col < alpha.length) {
            while (row < alhpa[row].length) {
                System.out.print(alpha[row][col] + " ");
                row++;
            }
            row = 0;
            col++;
            System.out.println();
        }
    


    }
}