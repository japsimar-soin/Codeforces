import java.util.*;

public class A_1362_JohnyAndAncientComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            ans[i] = solve(a, b);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static int solve(long a, long b){
        if(a == b){
            return 0;
        }
        int count = 0;
        if(b > a){
            long div = b/a;
            if(div%2 != 0){
                return -1;
            }
            while(div%8 == 0){
                count++;
                div = div/8;
            }
            while(div%4 == 0){
                count++;
                div = div/4;
            }
            while(div%2 == 0){
                count++;
                div = div/2;
            }
            if(div != 1){
                return -1;
            }
        }
        else{
            long div = a/b;
            if(div%2 != 0){
                return -1;
            }
            while(div%8 == 0){
                count++;
                div = div/8;
            }
            while(div%4 == 0){
                count++;
                div = div/4;
            }
            while(div%2 == 0){
                count++;
                div = div/2;
            }
            if(div != 1){
                return -1;
            }
        }
        return count;
    }
    
}
