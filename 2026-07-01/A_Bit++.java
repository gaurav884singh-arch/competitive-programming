import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int ans=0;
	    while (n!=0){
	        String s =sc.next();
	        if (s.equals("++X")){
	            ans++;
	        }
	        else if (s.equals("X++")){
	            ans++;
	        }
	        else{
	            ans--;
	        }
	        n--;
	    }
	    System.out.println(ans);
	}
}