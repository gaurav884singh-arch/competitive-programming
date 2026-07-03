import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		String s1 = S1.toLowerCase();
		String s2 = S2.toLowerCase();
		int count = 0;
		for (int i=0; i<S1.length(); i++){
		    if (s1.charAt(i) < s2.charAt(i)){
		        count = -1;
		        break;
		    }
		    else if  (s1.charAt(i) > s2.charAt(i)){
		        count = 1;
		        break;
		    }
		    else{
		        count = 0;
		    }
		}
		System.out.println(count);
	}
}