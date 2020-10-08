import java.util.*;

public class MigratoryBirds{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sol = {0,0,0,0,0};
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                sol[0]++;
            }
            if (arr[i] == 2) {
                sol[1]++;
            }
            if (arr[i] == 3) {
                sol[2]++;
            }
            if (arr[i] == 4) {
                sol[3]++;
            }
            if (arr[i] == 5) {
                sol[4]++;
            }
        }
        int max = 0;
        int maxLoc = 0;
        for (int i = 0; i < 5; i++) {
            int temp = sol[i];
            if (temp>max) {
                max = temp;
                maxLoc = i;
            }
        }
        System.out.println(maxLoc+1);
    }
}