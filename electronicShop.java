import java.util.*;

public class electronicShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] keyboard = new int[n];
        int[] drives = new int[m];
        for (int i = 0; i < n; i++) {
            keyboard[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            drives[i] = sc.nextInt();
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int bill = keyboard[i] + drives[j];
                if (bill<=b) {
                    max = Math.max(max, bill);
                }
            }
        }
        System.out.println(max);
    }
}

