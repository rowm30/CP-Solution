import java.util.*;

public class subArrayDivision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt()
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(MasterFunction(n, d, m, arr));
    }
    public static int MasterFunction(int n,int d,int m,int[] sum){
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i] + sum[i-1];
        }
        int ans = (m <= n && sum[m - 1] == d) ? 1 : 0;
        
        for (int i = m; i < n; i++) {
            if (sum[i] - sum[i - m] == d) {
                ans++;
            }
        }
        return ans;
    }
}