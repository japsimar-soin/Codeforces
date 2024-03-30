package RandomQuestions;
import java.util.*;

public class A_1766_ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[t];
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            arr[i] = solve(n);
        }
        
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int solve(int n){
        if(n > 900000){
            return 9*6;
        }
        else if(n>90000){
            return 9*5+n/100000;
        }
        else if(n>9000){
            return 9*4+n/10000;
        }
        else if(n>900){
            return 9*3+n/1000;
        }
        else if(n>90){
            return 9*2+n/100;
        }
        else if(n>9){
            return 9*1+n/10;
        }
        else {
            return n;
        }
    }
}
