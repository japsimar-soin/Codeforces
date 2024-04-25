package RandomQuestions;

import java.util.*;

public class B_1691_ShoeShuffling {
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
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static int[] solve(int n, int[] arr) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int val = entry.getValue();
            if(val == 1){
                return new int[]{-1};
            }
        }
        int count = 0;
        int k = 0;
        int[] ans = new int[n];
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int val = entry.getValue();
            count += val;
            ans[k] = count;
            k++;
            val--;
            while(val-- > 0){
                ans[k++] = count-1-val;
            }
        }
        return ans;
    }
    
    
}
