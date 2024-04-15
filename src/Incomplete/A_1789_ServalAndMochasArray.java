package Incomplete;
import java.util.*;

public class A_1789_ServalAndMochasArray {
    //------------------------------INCOMPLETE------------------------------INCOMPLETE------------------------------INCOMPLETE----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        boolean[] ans = new boolean[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            boolean val = solve(n, arr);
            ans[i] = val;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(!ans[i] ? "YES" : "NO");
        }
    }
    
    public static boolean solve(int n, int[] arr){
        Arrays.sort(arr);
        int gcd;
        for(gcd=n+1; gcd<=arr[0]; gcd++){
            boolean flag = true;
            for(int i=0; i<n; i++){
                if(arr[i]%gcd != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
