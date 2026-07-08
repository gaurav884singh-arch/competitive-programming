import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int i = 1;
		int a = n;
		while (i <= w){
		    n = n-(i*k);
		    i++;
		}
		if (n>0 && n<=a){
		    System.out.println(0);
		}
		else{
		    System.out.println(Math.abs(n));
		}
	}
}