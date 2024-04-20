package RandomQuestions;
import java.util.Scanner;

public class B_1411_FairNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            ans[i] = solve(n);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    
    public static long solve(long n){
        while(true){
            if(isFair(n)){
                return n;
            }
            n++;
        }
    }
    
    public static boolean isFair(long n){
        long num = n;
        while(num > 0) {
            long last = num % 10;
            if (last != 0 && n % last != 0) {
                break;
            }
            num /= 10;
        }
        if(num == 0){
            return true;
        }
        return false;
    }
}

