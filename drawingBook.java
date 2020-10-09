import java.util.*;

public class drawingBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int f = p/2;
        int b = 0;
        if (n%2 == 0) {
            b = (n-p+1)/2;
        } else {
            b = (n-p)/2;
        }
        System.out.println(Math.min(b, f));
    }
}
