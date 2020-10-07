import java.util.*;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * (n - i);
        }
        return ans;
    }
}
