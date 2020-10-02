import java.util.*;

public class DivisibleSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((ar[i]+ar[j])%k == 0 && i!=j) {
                    ans++;
                }
            }
        }
        System.out.println(ans/2);
    }    
}
