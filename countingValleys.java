import java.util.*;

public class countingValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        String[] arr = new String[steps]; 
        int level = 0;
        int ans = 0;
        for (int i = 0; i < steps; i++) {
            if (arr[i] == 'U') {
                level++;
            } else {
                level--;
            }
            if (level == -1) {
                if (arr[i+1 == 'U']) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }   
}
