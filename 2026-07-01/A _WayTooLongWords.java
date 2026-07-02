import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        while(i!=0){
            String s = sc.next();
            int n = s.length();
            char first = s.charAt(0);
            char last = s.charAt(n-1);
            if (n>10){
                System.out.println(""+first + (n-2) + last);
            }
            else{
                System.out.println(s);
            }
            i--;
        }
	}
}