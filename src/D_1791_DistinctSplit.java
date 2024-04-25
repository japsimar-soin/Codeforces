import java.util.*;

public class D_1791_DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            ans[i] = solve(n, s);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static int solve(int n, String s){
        HashMap<Character, Integer> right = new HashMap<>();
        HashMap<Character, Integer> left = new HashMap<>();
        int ans = 0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            right.put(c, right.getOrDefault(c, 0)+1);
        }
        for (int i = 0; i < n-1; i++) {
            char c = s.charAt(i);
            left.put(c, left.getOrDefault(c, 0)+1);
            right.put(c, right.get(c)-1);
            if(right.get(c) == 0){
                right.remove(c);
            }
            ans = Math.max(ans, right.size()+left.size());
        }
        return ans;
    }
}
