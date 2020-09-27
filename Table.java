import java.util.*;

public class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        for(int i = 1; i < n+1; i++){
            for (int j = 1; j < n+1; j++) {
                System.out.print(j*m+" ");
            }
            m++;
            System.out.println("");
        }
    }
}