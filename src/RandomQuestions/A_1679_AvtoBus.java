package RandomQuestions;
import java.util.*;

public class A_1679_AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[][] arr = new long[t][2];
        
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            arr[i] = solve(n);
        }
        
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i].length == 1 ? -1 : arr[i][0] + " " + arr[i][1]);
        }
    }
    
    private static long[] solve(long n){
        long max = 0;
        long min = 0;
        if(n%2 == 1 || n < 4){
            return new long[]{-1};
        }
        if(n%4 == 0){
            max = n/4;
        }
        else{
            max = 1+(n-6)/4;
        }
        if(n%6 == 0){
            min = n/6;
        }
        else{
            min = (n-4)%6 == 0 ? 1+(n-4)/6 : 2+(n-4)/6;
        }
        return new long[]{min, max};
    }
    
}
