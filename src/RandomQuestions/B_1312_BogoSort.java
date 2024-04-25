package RandomQuestions;

import java.util.*;

public class B_1312_BogoSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] ans = new int[t][];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[] res = solve(n, arr);
            ans[i] = res;
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    private static int[] solve(int n, int[] arr){
        Arrays.sort(arr);
        int[] ans = new int[n];
        for (int i = n-1; i >= 0; i--) {
            ans[i] = arr[n-i-1];
        }
        return ans;
    }
}
