import java.util.*;

public class BreakingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sample = new int[n];
        for (int i = 0; i < n; i++) {
            sample[i] = sc.nextInt();
        }
        int[] OP = BR(sample);
        for (int i = 0; i < OP.length; i++) {
            System.out.print((OP[i]-1)+" ");
        }
    }
    public static int[] BR(int[] arr){
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element<min) {
                min = element;
                ans[1]++;
            }
            if (element>max) {
                max = element;
                ans[0]++;
            }
        }
        return ans;
    }
}
