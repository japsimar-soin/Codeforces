package RandomQuestions;

import java.util.*;

public class B_1447_NumbersBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            int ans = solve(arr, m, n);
            res[i] = ans;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }
    
    public static int solve(int[][] grid, int m, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int neg = 0;
        for(int i=0; i<n; i++){
            for (int j = 0; j < m; j++) {
                if(grid[i][j] < 0){
                    neg++;
                }
                pq.add(Math.abs(grid[i][j]));
            }
        }
        int sum = 0;
        int first = pq.peek();
        while(!pq.isEmpty()){
            sum += pq.remove();
        }
        if(neg%2 == 1){
            sum -= 2*first;
        }
        return sum;
    }
}
