import java.util.*;

public class BwTwoSets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int ctr = 0;
        for (int i = a[n-1]; i <= b[0]; i++) {
            int ctr1 = 0;
            int ctr2 = 0;
            for (int j = 0; j < n; j++) {
                if (i%a[j]!=0) {
                    ctr1++;
                    break;
                }
            }
            for (int j = 0; j < b.length; j++) {
                if (b[j]%i!=0) {
                    ctr2++;
                    break;
                }
            }
            if (ctr1==0&&ctr2==0) {
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}