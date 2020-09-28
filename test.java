import java.util.*;

public class test {
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

    public static int partition(int a[],int beg,int end){
        int left,right,temp,loc,flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while(flag != 1){
            
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        sort(b,0,a-1);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
