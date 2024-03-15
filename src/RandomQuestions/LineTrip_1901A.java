//package RandomQuestions;
import java.util.Scanner;

public class LineTrip_1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int val = solve(n, x, arr);
            ans[i] = val;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static int solve(int n, int x, int[] arr){
        int min = arr[0];
        int prev = arr[0];
        for(int i=1; i<arr.length; i++){
            int diff = arr[i]-prev;
            if(diff > min){
                min = diff;
            }
            prev = arr[i];
        }
        min = Math.max(min, 2*(x-arr[arr.length-1]));
        return min;
    }
}
