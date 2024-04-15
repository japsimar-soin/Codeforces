package RandomQuestions;
import java.util.*;

public class A_1814_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        boolean[] arr = new boolean[t];
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            arr[i] = solve(n, k);
        }
        
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i] ? "Yes" : "No");
        }
    }
    
    public static boolean solve(int n, int k){
        if((n > 1) && (n%2 == 0)){
            return true;
        }
        else{
            return k%2 == 1;
        }
    }
}
