import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int ans=0;
	    while (n!=0){
	        int p ,v ,t;
	        p = sc.nextInt();
	        v = sc.nextInt();
	        t = sc.nextInt();
	        int s=0;
	        s=p+v+t;
	        if (s>=2){
	            ans++;
	        }
	        n--;
	    }
	    System.out.println(ans);
	}
}