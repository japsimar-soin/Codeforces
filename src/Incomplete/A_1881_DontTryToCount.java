package Incomplete;
import java.util.*;
public class A_1881_DontTryToCount {
    
    //------------------------------INCOMPLETE------------------------------INCOMPLETE------------------------------INCOMPLETE----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[t];
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.next();
            sc.nextLine();
            String s = sc.next();
            arr[i] = solve(x, s, m, n);
        }
        
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int solve(String x, String s, int m, int n){
        int ans = 0;
        boolean found = false;
        int max = 6; //constraint given: (m.n <= 25), so max iterations needed would be only to create 2^5 = 32 is 5, so we take 6 for safer side
        while(max-- > 0){
            if(isSubstring(x, s)){
                found = true;
                break;
            }
            ans++; //ek aur baar append krna hoga
            x = x+x;
        }
        if(found){
            return ans;
        }
        return -1;
    }
    
    public static boolean isSubstring(String x, String s){
        if(x.contains(s)){
            return true;
        }
        return false;
    }
}
