package RandomQuestions;

import java.util.Scanner;

public class C_1374_MoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int ans = solve(n, s);
            arr[i] = ans;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int solve(int n, String s) {
        int i = 0;
        int o = 0;
        int c = 0;
        int ans = 0;
        while(i < n){
            char a = s.charAt(i);
            if(c > o){
                ans++;
                c--;
            }
            if(a == '('){
                o++;
            }
            else{
                c++;
            }
            i++;
        }
        return ans;
    }
}
