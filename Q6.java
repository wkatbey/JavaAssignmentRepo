public class Q6 {
    public static void main(String[] args) {
        double[] salary = {25000, 36500, 85000, 62500, 97000};
        double raise = 0.03;

        for (int i = 0; i < 5; i++) 
            System.out.printf("%d %.2f %.2f %n", (i + 1), salary[i], (salary[i] * raise));
    }
}