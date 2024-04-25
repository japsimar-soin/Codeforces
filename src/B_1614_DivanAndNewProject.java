import java.util.*;

public class B_1614_DivanAndNewProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pair[] ans = new pair[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            pair result = solve(n, arr);
            ans[i] = result;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i].time);
            for (int j = 0; j < ans[i].coordinates.length; j++) {
                System.out.print(ans[i].coordinates[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static pair solve(int n, int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(i, arr[i]);
        }
        hm = sortByValue(hm);
        int last = 0;
        boolean odd = false;
        if(n%2 == 0){
             last = n/2;
        }
        else{
            odd = true;
            last = n/2+1;
        }
        int t = 0;
        boolean twice = false;
        int[] a = new int[n+1];
        pair p = new pair();
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int idx = entry.getKey()+1;
            int val = entry.getValue();
            t += 2*last*val;
            a[idx] = twice ? last : -last;
            if(odd) {
                twice = true;
                odd = false;
            }
            if(twice){
                last--;
            }
            twice = !twice;
        }
        p.time = t;
        p.coordinates = a;
        return p;
    }
    
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm){
        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    
    public static class pair{
        int time;
        int[] coordinates;
        pair() {}
        pair(int time, int[] coordinates) {
            this.time = time;
            this.coordinates = coordinates;
        }
    }
}
