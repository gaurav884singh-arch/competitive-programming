
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean D = false;
        
        for (int i = 0; i <= s.length() - 7; i++) {
            String sub = s.substring(i, i + 7);
            if (sub.equals("1111111") || sub.equals("0000000")) {
                D = true;
                break;
            }
        }
        
        if (D) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}