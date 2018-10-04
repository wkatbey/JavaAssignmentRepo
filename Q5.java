public class Q5 {
    public static void main(String[] args) {
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int[] list3 = new int[10];
        int a, b, c;

        //c = sum(a, b); //Invalid
        a = sum(list1[0], list2[0]); 
        //c = sum(list1, list2); //Invalid
        for (int i = 1; i < 10; i++)
            list3[i] = sum(list1[i], list2[i]);
        System.out.print("Working: New Version");
    }
    public static int sum(int x, int y) {
        return x + y;
    }
}