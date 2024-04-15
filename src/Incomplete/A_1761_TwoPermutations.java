package Incomplete;
import java.util.*;

public class A_1761_TwoPermutations {
    //------------------------------INCOMPLETE------------------------------INCOMPLETE------------------------------INCOMPLETE----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        boolean[] arr = new boolean[t];
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = solve(n, a, b);
        }
        
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i] ? "YES" : "NO");
        }
    }
    
    public static boolean solve(int n, int a, int b){
        if(a == n && b == n){
            return true;
        }
        boolean ans;
        ans = n-(a+b) > 1;
        return ans;
    }
}
