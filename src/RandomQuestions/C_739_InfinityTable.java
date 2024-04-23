package RandomQuestions;
import java.util.*;

public class C_739_InfinityTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[t][2];
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int[] ans = solve(k);
            arr[i] = ans;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
    
    public static int[] solve(int k){
        int[] ans = new int[2];
        int root = (int)Math.sqrt(k);
        int square = root*root;
        if(square == k){
            return new int[]{root,1};
        }
        else{
            root = root+1;
            square = root*root;
        }
        
        if(k > square-root){
            ans[0] = root;
            int diff = k - (square-root);
            int col = root-(diff-1);
            ans[1] = col;
        }
        else if(k <= square-root){
            ans[1] = root;
            int diff = square-root-k;
            int row = root-diff-1;
            ans[0] = row;
        }
        return ans;
    }
}
