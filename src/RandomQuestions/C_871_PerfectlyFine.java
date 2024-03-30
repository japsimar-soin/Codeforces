package RandomQuestions;
import java.util.*;

public class C_871_PerfectlyFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] minutes = new int[n];
            String[] skills = new String[n];
            for (int j = 0; j < n; j++) {
                minutes[j] = sc.nextInt();
                skills[j] = sc.next();
                sc.nextLine();
            }
            int ans = solve(n, minutes, skills);
            arr[i] = ans;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
    
    private static int solve(int n, int[] minutes, String[] skills) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = -1;
        for (int i = 0; i < n; i++) {
            String s = skills[i];
            int skill = 0;
            int m = minutes[i];
            if (s.equals("00")){
                skill = 0;
            }
            else if(s.equals("01")){
                skill = 1;
            }
            else if(s.equals("10")){
                skill = 2;
            }
            else if(s.equals("11")){
                skill = 3;
            }
            if(hm.containsKey(skill)){
                if(m < hm.get(skill)){
                    hm.put(skill, m);
                }
            }
            else{
                hm.put(skill, m);
            }
        }
        if(hm.containsKey(1) && hm.containsKey(2)){
            ans = hm.get(1)+hm.get(2);
        }
        if(hm.containsKey(3)){
            ans = ans == -1 ? hm.get(3) : Math.min(ans, hm.get(3));
        }
        return ans;
    }
}
