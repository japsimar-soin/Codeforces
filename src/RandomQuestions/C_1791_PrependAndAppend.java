package RandomQuestions;
import java.util.*;

public class C_1791_PrependAndAppend {
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
    
    public static int solve(int n, String s){
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                break;
            }
            i++;
            j--;
        }
        return j-i+1;
    }
}
