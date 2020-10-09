import java.util.*;

public class SalesByMatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            int temp = sc.nextInt();
            arr[temp]++;
        }
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            ans += arr[i]/2
        }
        System.out.println(ans);
}
