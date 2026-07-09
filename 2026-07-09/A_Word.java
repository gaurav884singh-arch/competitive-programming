import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = 0;
		int n = s.length();
		int u = 0, l = 0;
		while (i<n){
		    if (s.charAt(i) >= 65 && s.charAt(i) <= 90){
		        l++;
		    }
		    else{
		        u++;
		    }
		    i++;
		}
		if (u < l){
		    System.out.println(s.toUpperCase());
		}
		else {
		    System.out.println(s.toLowerCase());
		}
	}
}