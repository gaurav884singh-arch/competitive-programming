import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            total += c[i];
        }
        
        Arrays.sort(c);
        
        int Sum = 0;
        int count = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            Sum += c[i];
            count++;
            if (Sum > total - Sum) {
                break;
            }
        }
        
        System.out.println(count);
    }
}