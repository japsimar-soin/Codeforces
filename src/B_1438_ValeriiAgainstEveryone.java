import java.util.Scanner;

public class B_1438_ValeriiAgainstEveryone {
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
            boolean res = solve(n, arr);
            ans[i] = res;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i] ? "YES" : "NO");
        }
    }

    public static boolean solve(int n, int[] arr){
        return false;
    }
}
