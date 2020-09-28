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
    
    public static int[] CE(int[] parr1,int[] parr2){
        int[] sol = new int[parr1.length];
        for (int i = 0; i < parr1.length; i++) {
            if (parr1[i]==parr2[i]) {
                sol[i] = parr1[i];
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int[] fina = new int[arr2.length];  
        int ans = 0;
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            int[] temp1 = CF(arr2[i]);
        }
        int[] sam = {0,1,2,3,4,5};
        int[] sam2 = {0,1,2,3,7,6};
        fina = CE(sam,sam2);

        for (int i = 0; i < fina.length; i++) {
            System.out.println(fina[i]);
        }
    }

}
