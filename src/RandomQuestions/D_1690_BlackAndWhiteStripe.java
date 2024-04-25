package RandomQuestions;
import java.util.*;

public class D_1690_BlackAndWhiteStripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            ans[i] = solve(n, k, s);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    private static int solve(int n, int k, String s) {
        int min = n;
        int l = 0, r = 0;
        int b = 0, w = 0;
        while(r < n){
            char c = s.charAt(r);
            if(c == 'W'){
                w++;
            }
            else{
                b++;
            }
            if(b+w == k){
                min = Math.min(w, min);
                if(s.charAt(l) == 'W'){
                    w--;
                }
                else{
                    b--;
                }
                l++;
            }
            r++;
        }
        return min;
    }
}
