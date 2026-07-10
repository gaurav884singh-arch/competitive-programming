
import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean a = true;
		while (true){
		    n=n+1;
		    int d = n;
		     a = true; 
            boolean[] visited = new boolean[10]; 
            while (d > 0) {
                int r = d % 10; 
                
                if (visited[r]) { 
                    a = false; 
                    break;     
                }
                
                visited[r] = true; 
                d = d / 10;
            }
            if (a == true) {
                System.out.println(n);
                break;
                
            }
		}
	}
}