package RandomQuestions;

import java.util.*;

public class C_1506_DoubleEndedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int res = solve(a, b);
            ans[i] = res;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    private static int solve(String a, String b){
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        int common = LCS(m, n, a, b, dp);
        return m-common+n-common;
    }
    
    private static int LCS(int m, int n, String a, String b, int[][] dp){
        int result = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }
}
