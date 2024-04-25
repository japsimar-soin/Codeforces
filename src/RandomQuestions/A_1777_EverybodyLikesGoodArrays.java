package RandomQuestions;
import java.util.*;

public class A_1777_EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int val = solve(n, arr);
            ans[i] = val;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    private static int solve(int n, int[] arr){
        int ans = 0;
        int prev = arr[0]%2;
        int i = 0;
        while(i<n){
            int count = 1;
            int j = i+1;
            while(j<n && arr[j]%2 == prev){
                count++;
                j++;
            }
            ans += count-1;
            prev = j<n ? arr[j]%2 : 0;
            i = j;
        }
        return ans;
    }
}
