package RandomQuestions;

import java.util.Scanner;

public class RestoringDurationOfTasks_797C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[t][];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] start = new int[n];
            int[] end = new int[n];
            for (int j = 0; j < n; j++) {
                start[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                end[j] = sc.nextInt();
            }
            int[] ans = solve(n, start, end);
            arr[i] = ans;
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
//    0  3  7
//    2  10 11
    private static int[] solve(int n, int[] start, int[] end) {
        int[] ans = new int[n];
        ans[0] = end[0]-start[0];
        for (int i = 1; i < n; i++) {
            int diff = start[i]>=end[i-1] ? end[i]-start[i] : end[i]-end[i-1];
            ans[i] = diff;
        }
        return ans;
    }
}
