import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int i = 0;
        int count = 0;
        while (i < n-1){
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}