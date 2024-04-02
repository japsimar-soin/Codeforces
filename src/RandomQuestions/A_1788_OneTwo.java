package RandomQuestions;
import java.util.*;

public class A_1788_OneTwo {
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
    
    public static int solve(int n, int[] arr){
        int ans = -1;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 2){
                count++;
            }
        }
        if(count%2 == 1){
            return -1;
        }
        int two = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 2) {
                two++;
            }
            if(count-two == two){
                return i+1;
            }
        }
        return ans;
    }
}
