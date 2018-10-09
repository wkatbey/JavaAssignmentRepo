import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int[][] temperatureData = new int[12][2];
        getData(temperatureData);
        System.out.printf("%s %d%n", "Average High Temperature:", averageHigh(temperatureData));
        System.out.printf("%s %d%n", "Average Low Temperature:", averageLow(temperatureData));
        System.out.printf("%s %d%n", "Highest Temperature:", temperatureData[indexHighTemp(temperatureData)][1]);
        System.out.printf("%s %d%n", "Lowest Temperature:", temperatureData[indexLowTemp(temperatureData)][0]);
    }

    public static void getData(int[][] temperatureData) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the highest temperatures for each month: ");
         for (int i = 0; i < temperatureData.length; i++) {
            //Each 'month'/index has two columns: 0 -> Lowest Temp, 1 -> Highest Temp
            temperatureData[i][1] = input.nextInt();
        }

        System.out.println("Enter the lowest temperatures for each month: ");
        for (int i = 0; i < temperatureData.length; i++) {
            //Each 'month'/index has two columns: 0 -> Lowest Temp, 1 -> Highest Temp
            temperatureData[i][0] = input.nextInt();
        }

        
    }
    public static int averageHigh(int[][] temperatureData) {
        int sumOfTemperatures = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            sumOfTemperatures += temperatureData[i][1];
        }
        return (sumOfTemperatures/temperatureData.length);
    }
    public static int averageLow(int[][] temperatureData) {
        int sumOfTemperatures = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            sumOfTemperatures += temperatureData[i][0];
        }
        return (sumOfTemperatures/temperatureData.length);
    }
    public static int indexHighTemp(int[][] temperatureData) {
        //Searching through highest temps to find index of highest temperature in array
        int highestTemp = 0;
        int indexOfHighestTemp = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i][1] > highestTemp) {
                highestTemp = temperatureData[i][1];
                indexOfHighestTemp = i;
            }
        }
        return indexOfHighestTemp;
    }
    public static int indexLowTemp(int[][] temperatureData) {
        int lowestTemp = 0;
        int indexOfLowestTemp = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i][0] < lowestTemp) {
                lowestTemp = temperatureData[i][0];
                indexOfLowestTemp = i;
            }
        }
        return indexOfLowestTemp;
    }
}