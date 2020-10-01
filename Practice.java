import java.util.*;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            arr.add(m);
        }
        String k = sc.next();
        arr.add(k);
        System.out.println(arr);
    }
}
