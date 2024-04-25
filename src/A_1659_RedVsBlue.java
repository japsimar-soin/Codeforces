import java.util.*;

public class A_1659_RedVsBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] ans = new String[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            ans[i] = solve(r,b);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static int help(int n, int r, int b){
        b = b+1;
        if(((r%2 == 0) && (b%2 == 0)) || ((r%2 == 1) && (b%2 == 1))){
            return r/b;
        }
        else{
            return (r/b)+1;
        }
    }
    
    public static String solve(int r, int b){
        int r_ = help(r+b, r, b);
        StringBuilder sb = new StringBuilder();
        boolean first = false;
        while(r > 0){
            int c = 0;
            while(first && r > 0 && c < r_-1){
                sb.append("R");
                c++;
                r--;
            }
            while((!first) && (r > 0) && (c < r_)){
                sb.append("R");
                c++;
                r--;
                first = true;
            }
            if(r > 0){
                sb.append("B");
            }
        }
        return sb.toString();
    }
}
