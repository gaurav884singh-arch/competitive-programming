import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =  sc.next().toLowerCase();
		s = s.replaceAll("[aeiouy]","");
		String a = "";
		for(int i = 0 ; i<s.length() ; i++){
		    a = a + "." + s.charAt(i);
		}
		System.out.println(a);
	}
}