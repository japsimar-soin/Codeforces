package RandomQuestions;
import java.util.*;

public class A_1783_MakeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
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
            if(ans[i].length > 0){
                System.out.println("YES");
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
    private static int[] solve(int n, int[] arr){
        Arrays.sort(arr);
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1]+arr[i];
        }
        for(int i=0; i<n-1; i++){
            if(pref[i] == arr[i+1]){
                if(arr[i] == arr[n-1]) {
                    return new int[]{};
                }
                else{
                    swap(arr, i, n-1);
                    return arr;
                }
            }
        }
        return arr;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
