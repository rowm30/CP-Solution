import java.util.*;

public class Sets {
    public static int[] CF(int num){
        Deque<Integer> dq = new LinkedList<Integer>();
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                dq.add(i);
            }
        }
        int[] solarr = new int[dq.size()];
        for (int i = 0; i < solarr.length; i++) {
            solarr[i] = dq.pollLast();
        }
        return solarr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        
    }

}
