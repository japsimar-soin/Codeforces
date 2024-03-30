import java.util.*;

public class Main {
//    public static int minXORAfterDeletion(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            return 0;
//        }
//
//        int xorAll = 0;
//        int smallest = Integer.MAX_VALUE;
//
//        for (int num : arr) {
//            xorAll ^= num;
//            smallest = Math.min(smallest, num);
//        }
//
//        return xorAll ^ smallest;
//    }

    static int mod = (int)1e9+7;
    public static int help(int p, int c, int n, int k, char prev, int[][][] dp){
        if(p<0 || c<0){
            return 0;
        }
        if(p==0 && c==0){
            return 1;
        }
        if(dp[p][c][n] != -1){
            return dp[p][c][n];
        }
        int count = 0;
        if(prev == 'P'){
            if(n == 0){
                count += help(p, c-1, k-1, k, 'C', dp)%mod;
            }
            else{
                count += help(p-1, c, n-1, k, 'P', dp)%mod + help(p, c-1, k-1, k, 'C', dp)%mod;
            }
        }
        else if(prev == 'C'){
            if(n==0){
                count += help(p-1, c, k-1, k, 'P', dp)%mod;
            }
            else{
                count += help(p, c-1, n-1, k, 'C', dp)%mod + help(p-1, c, k-1, k, 'P', dp)%mod;
            }
        }
        return dp[p][c][n] = count%mod;
    }
    
    
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                return false; // If num is divisible by any number from 2 to sqrt(num), it's not prime
            }
        }
        return true;
    }
    
    public static boolean isPythagorean(int num){
        if(isPrime(num) && ((num-1)%4 == 0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        int[] arr = {2,6,5,4,7,8};
//        int num = 5;
//        boolean result = isPythagorean(num);
//        if(result) {
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//        int[][][] dp = new int[][][];
//        for (int[][] arr: dp){ {
//            for(int[] r: arr){
//                Arrays.fill(r, -1);
//            }
//        }
//
//
//        }
        
        int x = 2;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                for (int k = j+1; k < 3; k++) {
                    x = x*3;
                    count++;
                }
            }
        }
        System.out.println(count);
//        int ans = help(2,2,1,2,'P', dp) + help(3,1,1,2,'C', dp);
//        System.out.println(ans);
    }
}
