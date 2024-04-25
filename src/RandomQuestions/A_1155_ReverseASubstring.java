package RandomQuestions;

import java.util.*;

public class A_1155_ReverseASubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] ans = solve(n, s);
        if(ans[0] == -1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            System.out.println(ans[0] + " " + ans[1]);
        }
    }

    private static int[] solve(int n, String s){
        int i = 1;
        while(i < n){
            char c = s.charAt(i);
            char p = s.charAt(i-1);
            if(c < p){
                return new int[]{i, i+1};
            }
            i++;
        }
        return new int[]{-1};
    }
}
