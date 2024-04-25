import java.util.*;

public class B_1474_DifferentDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            int d = sc.nextInt();
            ans[i] = solve(d);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static long solve(int d){
        long ans = 1;
        
        return ans;
    }
}
