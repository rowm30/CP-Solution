import java.util.*;

public class Kangaroo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        if (x1>x2) {
            if (v1>v2) {
                System.out.println("NO");
            }
             else {
                if( (x1*v1 % x2*v2 == 0 )||( x2*v2 % x1*v1 == 0)) {
                    System.out.println("YES");
                }else{
                    if(!((v1%v2 != 0) || (v2%v1 != 0))) {
                        System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
                        }
                }
            }
        } else {
            if (v1>v2) {
                if((x1*v1 % x2*v2 == 0 )||( x2*v2 % x1*v1 == 0)) {
                    System.out.println("YES");
                }
                else {
                    if(!((v1%v2 != 0) || (v2%v1 != 0))) {
                    System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
