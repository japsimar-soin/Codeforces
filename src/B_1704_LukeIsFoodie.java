import java.util.*;
public class B_1704_LukeIsFoodie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            ans[i] = solve(n, x, arr);
        }
        
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    private static int solve(int n, int x, int[] arr){
    
    }
    
}
