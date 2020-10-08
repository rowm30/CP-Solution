import java.util.*;

public class billDivision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for(int i = 0; i < n; i++){
            bill[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        // aa is actual ammount
        int aa = 0;
        for(int i = 0; i < n;i++){
            if(i != k){
                aa = aa + bill[i];
            }
        }
        if((aa/2) == b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-(aa/2));
        }
    }
}
