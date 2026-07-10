import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int i = 0,A = 0, B = 0;
		while(i<s.length()){
		    if(s.charAt(i) == 'A'){
		        A++;
		    }
		    else{
		        B++;
		    }
		    i++;
		}
		if (A == B){
		    System.out.println("Friendship");
		}
		else if (A > B){
		    System.out.println("Anton");
		}
		else{
		    System.out.println("Danik");
		}
	}
}